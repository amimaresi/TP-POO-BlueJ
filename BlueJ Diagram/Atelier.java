import java.util.ArrayList;

public class Atelier extends RendezVous{
    ArrayList<Patient> patients; 
    
    public Atelier(int id,int[]date,ArrayList<Patient> patients){
        super(id);
        this.date=date;
        this.patients=patients;
        this.duree=new int[]{1,0};
    }
    
}
