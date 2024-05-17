import java.util.ArrayList;
import java.util.HashMap;

public class CompteRenduQuestion implements CompteRendu{
    HashMap<String,Integer> notes;
    public float getNoteQuestion(String consigne){
        return notes.get(consigne);
    }
    
    public float getNoteTotale(){
        float sum=0; 
        for (var note : notes.entrySet()) { 		      
           sum+=note.getValue();		
      }
      return sum/notes.size();
    }
    public void setNoteQuestion(String consigne,int note){
        notes.put(consigne,note);
    }
}
