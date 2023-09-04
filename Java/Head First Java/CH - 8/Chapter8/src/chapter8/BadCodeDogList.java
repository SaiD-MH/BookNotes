/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter8;


public class BadCodeDogList {
    
    
    private Dog [] dogList = new Dog [5];
    private int idx = 0;
    public void add(Dog a ){
        
        
        if(idx<dogList.length){
            
            dogList[idx] = a;
            System.out.println("Dog added at index : " + idx++);
            
        }
        
    }
    
    
}
