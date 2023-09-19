package linkedlist;

public class LinkedList {

    public static void main(String[] args) {

        LinkList theList = new LinkList(); // make new list
        theList.insertFirst(22, 2.99); // insert four items
        theList.insertFirst(35, 2.99); // insert four items
        theList.insertFirst(80, 2.99); // insert four items
        
        theList.display();
        
        /*theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(99, 8.99);
        theList.insertFirst(15, 8.99);
        theList.display();// display list
        System.out.println("-------------------------------------------");
        
        Link del = theList.delete(66);
        theList.display();
        
        System.out.println("-------------------------------------------");
        System.out.println("To prove i still exist but in heap but  with _____zero____ refences");
        
        while (del != null) {
        del.display();
        del = del.next;
        }*/
    }

}
