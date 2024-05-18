import java.util.ArrayList;

public class BO {
    ArrayList<EpreuveClinique>  epreuves;
    Diagnostic diagnostic;
    ProjetTherapeutique projetTherapeutique;
    public void addEpreuveClinique(ArrayList<String> observations,ArrayList<Test> tests){
        epreuves.add(new EpreuveClinique(observations,tests));
    }
}
