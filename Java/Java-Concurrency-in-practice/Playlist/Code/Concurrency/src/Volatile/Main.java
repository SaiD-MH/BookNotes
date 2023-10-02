
package Volatile;

import java.util.Scanner;




public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
    
        
        System.out.println("press any key to terminate .....! ");
        Processor pc = new Processor();
        pc.start();
        
        
        new Scanner(System.in).nextLine();
        
        pc.shutdown();
        
        
    }
    
}
