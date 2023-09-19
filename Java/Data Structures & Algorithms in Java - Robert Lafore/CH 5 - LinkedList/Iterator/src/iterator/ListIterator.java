package iterator;

public class ListIterator {

    private Link current, prev;

    private LinkList ourlist;

    public ListIterator(LinkList l) {
        ourlist = l;
        reset();
    }

    public void reset() {
        current = ourlist.getFirst();
        prev = null;
    }

    public boolean atEnd() // true if last link
    {
        return (current.next == null);
    }

    public void nextLink() // go to next link
    {
        prev = current;
        current = current.next;
    }

    public Link getCurrent() // get current link
    {
        return current;
    }

    public void insertAfter(long dd) // insert after
    { // current link
        Link newLink = new Link(dd);
        if (ourlist.isEmpty()) // empty list
        {
            ourlist.setFirst(newLink);
            current = newLink;
        } else // not empty
        {
            newLink.next = current.next;
            current.next = newLink;
            nextLink(); // point to new link
        }
    }

    public void insertBefore(long dd) // insert before
    { // current link
        Link newLink = new Link(dd);
        if (prev == null) // beginning of list
        { // (or empty list)
            newLink.next = ourlist.getFirst();
            ourlist.setFirst(newLink);
            reset();
        } else // not beginning
        {
            newLink.next = prev.next;
            prev.next = newLink;
            current = newLink;
        }
    }

    public long deleteCurrent() // delete item at current
    {
        long value = current.dData;
        if (prev == null) // beginning of list
        {
            ourlist.setFirst(current.next);
            reset();
        } else // not beginning
        {
            prev.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return value;
    }
}
