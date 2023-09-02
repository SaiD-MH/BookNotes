
package ch5.code;

public class SimpleDotCom {
    
    
    int numberOfHits;
    int []locationCells;
    
    
    
    void setLocations(int[] locs){
        
        locationCells = locs;
        
    }
    String checkYourSelf(String userGuess){
        
        
        String result = "miss";
        
        int num = Integer.parseInt(userGuess);
        
        for(int loc : locationCells){
            
            
            if(loc == num){
                ++numberOfHits;
                result = "hit";
                break;
            }
            
        }
        
        
        if(numberOfHits == locationCells.length)
        {
            result = "kill";
        }
            
        System.out.println(result);
        return result;
    }
    
    
}
