package hashtable;

public class HTClass {

    private DataItem hashArr[], noItem;
    private int size;

    public HTClass(int size) {
        this.size = size;
        hashArr = new DataItem[size];

        noItem = new DataItem(-1);

    }

    public void displayTable() {

        System.out.print(
                "Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArr[j] != null) {
                System.out.print(hashArr[j].getKey() + " } ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");

    }

    public int hashFun(int key) {
        return key % size;
    }

    void insert(DataItem item) {

        int key = item.getKey();

        int hashVal = hashFun(key);

        while (hashArr[hashVal] != null && hashArr[hashVal].getKey() != -1) {
            hashVal++;
            hashVal %= size;
        }

        hashArr[hashVal] = item;
    }

    public DataItem delete(int key) {

        int hv = hashFun(key);

        while (hashArr[hv] != null) {

            if (hashArr[hv].getKey() == key) {

                DataItem temp = hashArr[hv];
                hashArr[hv] = noItem;
                return temp;
            }

            ++hv;
            hv %= size;

        }

        return null; // can't find you 

    }

    public DataItem find(int key) {
        int hv = hashFun(key);

        while (hashArr[hv] != null) {

            if (hashArr[hv].getKey() == key) {

                
                return hashArr[hv];
            }

            ++hv;
            hv %= size;

        }

        return null; // can't find you 
    }

}
