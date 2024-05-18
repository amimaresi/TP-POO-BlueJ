import java.util.HashMap;
import java.util.ArrayList;

public class CompteRenduExercice implements CompteRendu{
    HashMap<String,ArrayList<Integer>> notes;
    
    public CompteRenduExercice(HashMap<String,ArrayList<Integer>> notes){this.notes=notes;}
    public float getNoteExo(String consigne){
        ArrayList<Integer> exo=notes.get(consigne);
        float sum=0;
        for (Integer note : exo) {               
           sum+=note;
        }
        return sum/exo.size();
    }
    //////////////////////////////////////////  
    public float getNoteTotale(){
        float sum=0;
        for (var exo : notes.entrySet()) {
            sum+=getNoteExo(exo.getKey());

        }
        return sum/notes.size();
    }
    ///////////////////////////////////////
    public ArrayList<Integer> getNoteTentatives(String consigne,int index){
        return notes.get(consigne);
    }
}
