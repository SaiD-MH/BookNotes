package ch5.code;

import java.util.Scanner;

public class Ch5Code {

    public static void main(String[] args) {

        int numOfGuess = 0;

        SimpleDotCom theDotGame = new SimpleDotCom();

        int rand = (int) (Math.random() * 5);

        int[] loc = {rand, rand + 1, rand + 2};
        
        theDotGame.setLocations(loc);
        
        boolean alive = true;
        
        Scanner sc = new Scanner(System.in);
        while(alive){
            
            
            System.out.println("Enter Guessed Value");
            String Guessed = sc.nextLine();
            
            
            String get = theDotGame.checkYourSelf(Guessed);
            
            numOfGuess++;
            
            if(get.equals("kill")){
                
                System.out.println("Your result is  = " + numOfGuess);
                
                alive = false;
            }
            
            
            
            
            
        }
        
        

    }

}
