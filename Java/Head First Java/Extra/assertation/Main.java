
import java.util.*;
import java.io.*;
 
 /*
    
    javac Main.java

    java -ea Main  run with assertion                                          
 
 */ 


public class Main{

public static void main(String []args){


        System.out.println("Enter any Value Mate :) ");

        int x;
        
        x = new Scanner(System.in).nextInt();
        
        try{

        
        assert (x > 10); // if x bigger that 10 continue 
        System.out.println("I big than 10");

        }catch(Exception ex){
            System.out.println("sadad");
        }
        // else  throw exception

}

}