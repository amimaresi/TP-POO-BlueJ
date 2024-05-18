public class Suivi extends RendezVous{
    Patient patient;
    boolean type;
    FicheSuivi ficheSuivi;
    public Suivi(int id,int[]date,Patient patient,boolean type){
        super(id);
        this.date=date;
        this.duree=new int[]{1,0};
        this.type=type;
        this.patient=patient;
    }
}
