import java.util.ArrayList;
import java.util.HashMap;

public class DossierPatient {
    int id; // DossierPatient id
    Patient patient;
    NewBO nouveauBO;
    ArrayList<RendezVous> rendezVousList; 
    HashMap<Integer,BO> BOList;  // integer is RendezVous id
    HashMap<Integer,FicheSuivi> ficheSuiviList; // integer is RendezVous id
    public boolean setBO(int id,BO bo){
        if(rendezVousList.contains(id)) {
            BOList.put(id,bo);
            return true;
        };
        return false;
    }
    public void creerRendezVous(int id,int[]date,boolean type){
        rendezVousList.add(new Suivi(id,date,patient,type));
    }
    public void creerRendezVous(int id,int[]date){
        rendezVousList.add(new Consultation(id,date,patient));
    }
    public void creerRendezVous(int id,int[]date,ArrayList<Patient> patients){
        rendezVousList.add(new Consultation(id,date,patients));
    }
    
    public boolean setFicheSuivi(int id,FicheSuivi fs){
        if(rendezVousList.contains(id) && rendezVousList.get(id).getClass()==Suivi.class) {
            ficheSuiviList.put(id,fs);
            return true;
        };
        return false;
    }
    
    public RendezVous getRendezVous(int id){
        return rendezVousList.contains(id)?rendezVousList.get(id):null;
    }
    
    public BO getBO(int id){
        return BOList.containsKey(id)?BOList.get(rendezVousList.get(id)):null;
    }
    
    public FicheSuivi getFicheSuivi(int id){
        return ficheSuiviList.containsKey(id)?ficheSuiviList.get(rendezVousList.get(id)):null;
    }
    
    public RendezVous getLastRendezVous(){return rendezVousList.get(rendezVousList.size()-1);}
    
    public BO getLastBO(){
        return BOList.get(rendezVousList.get(rendezVousList.size()-1).getId());
    }
    
    public FicheSuivi getLastFicheSuivi(){ // need to check that RDV is not Atelier
        for (int i = rendezVousList.size() - 1; i >= 0; i--) {
            if (rendezVousList.get(i).getClass()==Suivi.class) {
                return ficheSuiviList.get(rendezVousList.get(i).getId());
            }
        }
        return null;
    }
}
