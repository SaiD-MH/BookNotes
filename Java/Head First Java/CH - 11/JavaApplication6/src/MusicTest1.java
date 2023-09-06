

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.sound.midi.*;


        
        
public class MusicTest1 {


    
    public void play(){
    
        try{
            
            Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("Sequencer created");
        }catch(MidiUnavailableException ex){
            System.err.println(ex.getMessage());
        }
        
        
    }
    
    
   
    
    
    public static void main(String[] args) {
      
        
        MusicTest1 mc1 = new MusicTest1();
        
        mc1.play();
        
        
    }
    
}
