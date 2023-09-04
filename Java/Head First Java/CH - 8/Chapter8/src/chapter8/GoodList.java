
package chapter8;

public class GoodList{

    private Animal [] AnimalList = new Animal [5]; // Create new Array of type Animal not making Animal Objects
    private int idx = 0;
    public void add(Animal a ){
        
        
        if(idx<AnimalList.length){
            
            AnimalList[idx] = a;
            
            System.out.println(a.getClass() + " added at index : " + idx++);
            
        }
        
    }
    
}
