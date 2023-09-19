package linkedlist.doublyendend;

public class Link {

    Link next;
    long iData;

    public Link(long iData) {
        this.iData = iData;
    }

    public void displayLink() // display this link
    {
        System.out.print(iData + " ");
    }
}
