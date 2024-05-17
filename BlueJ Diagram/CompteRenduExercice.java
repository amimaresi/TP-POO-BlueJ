import java.util.HashMap;
import java.util.ArrayList;

public class CompteRenduExercice implements CompteRendu{
    HashMap<String,ArrayList<Integer>> Notes;
    public float getNoteExo(String consigne){return 0;
    }
    public float getNoteTotale(){return 0;}
    public int getNoteTentative(String consigne,int index){
        return Notes.get(consigne).size()>index ?Notes.get(consigne).get(index):-1;
    }
    public void setNoteTentative(String consigne,int index,int note){
        Notes.get(consigne).add(note);
    }
}
