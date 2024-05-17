import java.util.HashMap;

public class QCM extends Question
{
    HashMap<String,Boolean> choix;
    public void reponse(HashMap<String,Boolean> reponse){
        this.choix=reponse;  
    }
}
