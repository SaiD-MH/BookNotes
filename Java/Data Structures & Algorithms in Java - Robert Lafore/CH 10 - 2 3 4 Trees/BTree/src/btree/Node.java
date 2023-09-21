package btree;

public class Node {

    private static final int ORDER = 4;
    private int numItems;
    private Node parent;
    private Node[] childArr = new Node[ORDER]; // 4 Node ..... 4 Links | | | |
    private DataItem[] itemArr = new DataItem[ORDER - 1]; // Each Node has 3 item [ , , ,]

    // connect child to this node
    public void connectChild(int childNum, Node child) {
        childArr[childNum] = child;
        if (child != null) {
            child.parent = this;
        }
    }
// -------------------------------------------------------------
// disconnect child from this node, return it

    public Node disconnectChild(int childNum) {
        Node tempNode = childArr[childNum];
        childArr[childNum] = null;
        return tempNode;
    }
// -------------------------------------------------------------

    public Node getChild(int childNum) {
        return childArr[childNum];
    }
// -------------------------------------------------------------

    public Node getParent() {
        return parent;
    }
// ------------------------------------------------------------

    public boolean isLeaf() {
        return (childArr[0] == null) ? true : false;
    }

    // -------------------------------------------------------------
    public int getNumItems() {
        return numItems;
    }
// -------------------------------------------------------------

    public DataItem getItem(int index) // get DataItem at index
    {
        return itemArr[index];
    }
// -------------------------------------------------------------

    public boolean isFull() {
        return (numItems == ORDER - 1) ? true : false;
    }
// -------------------------------------------------------------

    public int findItem(long key) // return index of
    { // item (within node)
        for (int j = 0; j < ORDER - 1; j++) // if found,
        { // otherwise,
            if (itemArr[j] == null) // return -1
            {
                break;
            } else if (itemArr[j].Data == key) {
                return j;
            }
        }
        return -1;
    } // end findItem
// -------------------------------------------------------------

    public int insertItem(DataItem newItem) {
// assumes node is not full
        numItems++; // will add new item
        long newKey = newItem.Data; // key of new item
        for (int j = ORDER - 2; j >= 0; j--) // start on right,
        { // examine items
            if (itemArr[j] == null) // if item null,
            {
                continue; // go left one cell
            } else // not null,
            { // get its key
                long itsKey = itemArr[j].Data;
                if (newKey < itsKey) // if it’s bigger
                {
                    itemArr[j + 1] = itemArr[j]; // shift it right
                } else {
                    itemArr[j + 1] = newItem; // insert new item

                    return j + 1; // return index to
                } // new item
            } // end else (not null)
        } // end for // shifted all items,
        itemArr[0] = newItem; // insert new item
        return 0;
    } // end insertItem()
// ------------------------------------------------------------

    public DataItem removeItem() // remove largest item
    {
// assumes node not empty
        DataItem temp = itemArr[numItems - 1]; // save item
        itemArr[numItems - 1] = null; // disconnect it
        numItems--; // one less item
        return temp; // return item
    }

    public void displayNode() // format “/24/56/74/”
    {
        for (int j = 0; j < numItems; j++) {
            itemArr[j].display();// “/56”
        }
        System.out.println("/"); // final “/”
}
// ------------------------------------------------------------
}
