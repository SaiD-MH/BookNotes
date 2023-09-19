
package linkedlist;

/**
 *
 * @author CLINIC
 */
public class Link {

    
    int iData;
    double dData;
    Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
      
    }
    
   
    void display(){
        
        System.out.println("{ " + iData + " , " + dData + " }");
        
    }

    
}
