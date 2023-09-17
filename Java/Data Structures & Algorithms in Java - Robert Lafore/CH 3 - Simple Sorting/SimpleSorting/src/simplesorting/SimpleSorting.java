package simplesorting;

public class SimpleSorting {

    public static void main(String[] args) {

        int maxSize = 100; // array size
        ArrayDs arr; // reference to array
        arr = new ArrayDs(maxSize); // create the array
        arr.insert(77); // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display(); // display items
        arr.insertionSort();// bubble sort them

        arr.display(); // display them again
    } // end main()
} // end class BubbleSortApp

