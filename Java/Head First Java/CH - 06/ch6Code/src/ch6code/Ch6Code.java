
package ch6code;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch6Code {
    
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int score = 0;
    private GameHelper GH = new GameHelper();
    
    
    private void setUp(){
        
        
        DotCom one = new DotCom();
        one.setName("“Pets.com");
        
        DotCom two = new DotCom();
        one.setName("“eToys.com");
        
        DotCom three = new DotCom();
        one.setName("“Go2.com");
        
        
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        
        
        for(DotCom d :dotComList){
            
            ArrayList<String> x = GH.placeDotCom(3);
            for(String s:x)
            {
                System.out.print(s + ' ');
            }
            System.out.println("");
            d.setLocationCells(x);
            
        }
        
    }
    
    private void startPlay(){
        
        Scanner sc = new Scanner(System.in);
        while(!dotComList.isEmpty()){
            
            System.out.println("Enter your Guess : ");
            String input = sc.nextLine();
            
            
            checkUserG(input);
            
            
            
        }
        
        
    }
    
    private void checkUserG(String str){
        
        ++score;
        String res = "miss";
        for(DotCom d : dotComList){
            
            res = d.checkYourSelf(str);
            
            if(res.equals("hit")){
                break;
                      
            }
             if(res.equals("kill")){
                
                dotComList.remove(d);
                break;
            }
        }
        
        
        System.out.println(res);
        
        
    }
    
    
    
    private void finishGame(){
        
        System.out.println("Your Score is :" + score);
    }

    
    public static void main(String[] args) {

        Ch6Code dotComBust = new Ch6Code();
        
        
        dotComBust.setUp();
        dotComBust.startPlay();
        dotComBust.finishGame();
        
        
        
    }
    
}
