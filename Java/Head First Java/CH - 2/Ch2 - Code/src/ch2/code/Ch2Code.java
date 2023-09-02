
package ch2.code;

public class Ch2Code {

   
    public static void main(String[] args) {
       
        
        Player p1 = new Player();
        Player p2 = new Player();
        
        
        if(p1==p2)
            System.out.println("YES 1");
        else
            System.out.println("NO 1");
        
        p1=p2;
        
        if(p1==p2)
            System.out.println("YES 1");
        else
            System.out.println("NO 1");
        
    }
    
}
