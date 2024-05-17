public class CompteOrtho {
    Agenda agenda;
    String nom;
    String prenom;
    String adresse;
    int tel;
    String email;
    String password;
    public CompteOrtho( String nom, String prenom, String adresse, int tel, String email, String password){
        agenda = new Agenda();
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.tel=tel;
        this.email=email;
        this.password=password;
    }

}
