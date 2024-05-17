import java.util.ArrayList;

public class CabinetOrtho{
    String nom;
    String adresse;
    ArrayList<DossierPatient> dossiers;
    CompteOrtho[] comptes;
    public CabinetOrtho(String nom,String adresse){
        this.nom=nom;
        this.adresse=adresse;
    }
    public CabinetOrtho(String nom){
        this.nom=nom;
    }
}
