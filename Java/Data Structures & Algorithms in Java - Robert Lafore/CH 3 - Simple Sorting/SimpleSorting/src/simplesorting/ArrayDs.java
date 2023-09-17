package simplesorting;

public class ArrayDs {

    private long[] a; // ref to array a
    private int nElems; // number of data items
//--------------------------------------------------------------

    public ArrayDs(int max) // constructor
    {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }
//--------------------------------------------------------------

    public void insert(long value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }
//--------------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " "); // display it

        }
        System.out.println("");
    }

    public void bubbleSort() {

        for (int loop = nElems - 1; loop >= 1; loop--) {

            for (int i = 0; i < loop; i++) {

                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                }

            }

        }

    }

    public void Selection() {

        for (int i = 0; i < nElems - 1; i++) {

            int cur = i;
            for (int j = i + 1; j < nElems; j++) {

                if (a[j] < a[cur]) {
                    cur = j;
                }

            }

            swap(cur, i);
        }

    }

    public void insertionSort() {

        for (int i = 1; i < nElems; i++) {

            long temp = a[i];
            int idx = i;

            while (idx > 0 && a[idx] >= temp) {
                a[idx] = a[idx - 1];
                idx--;
            }
            
            a[idx] = temp;
        }

    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
//--------------------------------------------------------------

}
