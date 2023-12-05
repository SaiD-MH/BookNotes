package linkedlist.doublyendend;

public class LinkList {

    Link first, last;

    public LinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) // insert at front of list
    {
        Link newLink = new Link(dd); // make new link
        if (isEmpty()) // if empty list,
        {
            last = newLink; // newLink <-- last
        }
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    public void insertLast(long dd) // insert at front of list
    {
        Link newLink = new Link(dd); // make new link
        if (isEmpty()) // if empty list,
        {
            first = newLink; // newLink <-- last
        }

        // add newLink to list using finalNode = Last.next
        last.next = newLink; // added

        last = newLink; // maintain LastLink

    }

    public long deleteFirst() // delete first link
    { // (assumes non-empty list)
        long temp = first.iData;
        if (first.next == null) {
            last = null; // null <-- last
        }
        first = first.next; // first --> old next
        return temp;
    }

    public void insertAsSorted(int val) {

        Link prev = null;
        Link cur = first;

        while (cur != null && val > cur.iData) {
             prev = cur;
             cur = cur.next;
        }
        
        Link newLink = new Link(val);
        if(prev == null)
            first = newLink;
        else
            prev.next = newLink;
        
        newLink.next = cur;
        
        

    }

    public void displayList() {
        System.out.print(
                "List(first-- > last) : ");
        Link current = first; // start at beginning
        while (current != null) // until end of list,
        {
            current.displayLink();// print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}
