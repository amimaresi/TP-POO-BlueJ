import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class RendezVous {
    public enum Type{CONSULTAION,SUIVI,ATELIER}
    int[] date;
    int[] duree;
    Patient patient;
    String observation;
    public void setObservation(String observation){
    this.observation=observation;
}
 
}
