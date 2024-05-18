import java.time.LocalDate;

public class Consultation extends RendezVous{
    Patient patient;
    Consultation(int id,int[]date,Patient patient){
    super(id);
    this.date=date;
    this.patient=patient;
    if(patient.getAge()<18) this.duree=new int[]{2,30};
    else this.duree=new int[]{1,30};
    }
}
