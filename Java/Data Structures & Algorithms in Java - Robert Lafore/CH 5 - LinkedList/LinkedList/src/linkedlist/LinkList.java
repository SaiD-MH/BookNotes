package linkedlist;

public class LinkList {

    Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double d) {
        Link newLink = new Link(id, d);

        newLink.next = first; // NULL
        //System.out.println(first);
        first = newLink;

    }

    public Link deleteFirst() {

        Link temp = first;

        first = first.next;
        return temp;
    }

    public Link find(int key) {

        Link cur = first;

        while (cur != null) {

            if (cur.iData == key) {
                return cur;
            } else {
                cur = cur.next;
            }

        }
        
        return null;
    }
    
    public Link delete(int key){
        
        Link cur = first;
        Link prev = first;
        
        
        while(cur != null){
            
            if(cur.iData == key){
                
                // first 
                
                if(cur ==first){
                    first = first.next;
                }
                else
                {
                    prev.next = cur.next;
                    
                }
                    
                    
                    return cur;
                
            }
            
            prev = cur;
            cur = cur.next;
            
            
        }
        
        return null;
        
    }

    void display() {

        Link cur = first;
        while (cur != null) {
            cur.display();
            cur = cur.next;
        }

    }

}
