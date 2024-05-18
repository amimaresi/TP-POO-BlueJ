import java.util.ArrayList;
import java.util.HashMap;

public class CabinetOrtho{
    String nom;
    HashMap<Integer,DossierPatient> dossiers;
    CompteOrtho comptes[];
    int currentRDVid;
    int currentPid;
    public CabinetOrtho(String nom){
        this.nom=nom;
    }
     public void creerRendezVous(int[]date,boolean type,Patient patient){
         dossiers.get(patient.getId()).addRendezVous(new Suivi(currentRDVid++,date,patient,type));
    }
    public void creerRendezVous(int[]date,Patient patient){
        dossiers.get(patient.getId()).addRendezVous(new Consultation(currentRDVid++,date,patient));
    }
    public void creerRendezVous(int[]date,ArrayList<Patient> patients){
        Atelier atelier=new Atelier(currentRDVid++,date,patients);
        for(Patient patient: patients){
            dossiers.get(patient.getId()).addRendezVous(atelier);
        }
    }
}
