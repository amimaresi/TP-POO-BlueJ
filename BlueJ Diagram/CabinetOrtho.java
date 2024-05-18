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
     public void creerRendezVous(int[]date,int[] heure,boolean type,Patient patient){
         dossiers.get(patient.getId()).addRendezVous(new Suivi(currentRDVid++,date,heure,patient,type));
    }
    public void creerRendezVous(int[]date,int[] heure,Patient patient){
        dossiers.get(patient.getId()).addRendezVous(new Consultation(currentRDVid++,date,heure,patient));
    }
    public void creerRendezVous(int[]date,int[] heure,ArrayList<Patient> patients){
        Atelier atelier=new Atelier(currentRDVid++,date,heure,patients);
        for(Patient patient: patients){
            dossiers.get(patient.getId()).addRendezVous(atelier);
        }
    }
}
