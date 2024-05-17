import java.util.HashMap;
import java.util.ArrayList;

public class CompteRenduExercice implements CompteRendu{
    HashMap<String,ArrayList<Integer>> notes;
    public float getNoteExo(String consigne){
        ArrayList<Integer> exo=notes.get(consigne);
        float sum=0;
        for (Integer note : exo) { 		      
           sum+=note;
      }
      return sum/exo.size();
    }
    public float getNoteTotale(){return 0;}
    public ArrayList<Integer> getNoteTentatives(String consigne,int index){
        return notes.get(consigne);
    }
    public void setNoteTentative(String consigne,int index,int note){
        notes.get(consigne).add(note);
    }
}
