import java.util.ArrayList;
import java.util.HashMap;

public class DossierPatient {
    Patient patient;
    NewBO nouveauBO;
    HashMap<Integer,RendezVous> rendezVousList;
    int lastRdvId;
    int lastSuivi;
    HashMap<Integer,BO> BOList;  // integer is RendezVous id
    public boolean setBO(int id,BO bo){
        if(rendezVousList.containsKey(id)) {
            BOList.put(id,bo);
            return true;
        };
        return false;
    }
   
    public void addRendezVous(RendezVous rdv){
        rendezVousList.put(rdv.getId(),rdv);
        lastRdvId=rdv.getId();
        if(rdv instanceof Suivi) lastSuivi=rdv.getId();
    }
    
    public boolean setFicheSuivi(int id,FicheSuivi fs){
        if(rendezVousList.containsKey(id) && rendezVousList.get(id) instanceof Suivi) {
            ((Suivi)rendezVousList.get(id)).setFicheSuivi(fs);
            return true;
        };
        return false;
    }
    
    public RendezVous getRendezVous(int id){
        return rendezVousList.containsKey(id)?rendezVousList.get(id):null;
    }
    
    public BO getBO(int id){
        return BOList.containsKey(id)?BOList.get(rendezVousList.get(id)):null;
    }
    
    public FicheSuivi getFicheSuivi(int id){
        return rendezVousList.containsKey(id) && rendezVousList.get(id) instanceof Suivi ? ((Suivi)rendezVousList.get(id)).getFicheSuivi():null;
    }
    
    public RendezVous getLastRendezVous(){return rendezVousList.get(lastRdvId);}
    
    public BO getLastBO(){
        return BOList.get(rendezVousList.get(lastRdvId));
    }
    
    public FicheSuivi getLastFicheSuivi(){ 
        return ((Suivi)rendezVousList.get(lastSuivi)).getFicheSuivi();
    }
}
