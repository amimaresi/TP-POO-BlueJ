import java.util.ArrayList;

public class Atelier extends RendezVous{
    ArrayList<Patient> patients; 
    
    public Atelier(int id,int[]date,int[]heure,ArrayList<Patient> patients){
        super(id,date,heure);
        this.patients=patients;
        this.duree=new int[]{1,0};
    }
    
}
