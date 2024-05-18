public class Suivi extends RendezVous{
    Patient patient;
    boolean type;
    FicheSuivi ficheSuivi;
    public Suivi(int id,int[]date,int[] heure,Patient patient,boolean type){
        super(id,date,heure);
        this.duree=new int[]{1,0};
        this.type=type;
        this.patient=patient;
    }
    public void setFicheSuivi(FicheSuivi ficheSuivi)
    {this.ficheSuivi=ficheSuivi;}
    public FicheSuivi getFicheSuivi(){return ficheSuivi;}
}
