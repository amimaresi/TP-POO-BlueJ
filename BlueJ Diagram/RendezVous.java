import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class RendezVous {
    public enum Type{CONSULTAION,SUIVI,ATELIER}
    private int id;
    int[] date;
    int[] duree;
    String observation;
    public void setObservation(String observation){
    this.observation=observation;
}
public RendezVous(){}
public RendezVous(int id){this.id=id;}
 public int getId(){return id;}
}
