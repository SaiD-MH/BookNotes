package chapter8;

import java.util.ArrayList;

public class Chapter8 {

    public static void main(String[] args) {

        /*............Just Specific For Dog type ..................... */
 /*
        BadCodeDogList a = new BadCodeDogList();
        
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c = new Cat();
        a.add(d1);
        a.add(d2);
        //a.add(c);
         */
 /*.......... Generic Types ................*/
 /* GoodList list = new GoodList();
 Dog d1 = new Dog();
 Dog d2 = new Dog();
 Cat c = new Cat();
 list.add(d1);
 list.add(d2);
 list.add(c);*/
       
    
 /*................Object Casting.......................*/
 
    ArrayList<Object> list = new ArrayList<Object>();
    
    Dog d1 = new Dog();
    Cat c = new Cat();
    
    list.add(c);
    list.add(d1);
    
    Object a = list.get(0);
    Dog d ;
    
        System.out.println(d);
    
    
        
       

    }

}
