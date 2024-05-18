import java.util.ArrayList;
import java.util.HashMap;

public class EpreuveClinique
{
    ArrayList<String> observations;
    ArrayList<Test> tests;
    ArrayList<CompteRendu> compteRendus;
    public EpreuveClinique(ArrayList<String> observations,ArrayList<Test> tests,ArrayList<CompteRendu> compteRendus){
        this.observations=observations;
        this.tests=tests;
        this.compteRendus=compteRendus;
    }
    public EpreuveClinique(ArrayList<String> observations,ArrayList<Test> tests){
        this.observations=observations;
        this.tests=tests;
    }
    public Test getTest(int numero){
        return tests.get(numero);
    }
    public CompteRendu getCompteRendu(int numero){
        return compteRendus.get(numero);
    }
    public boolean addCompteRenduExercice(int numero,HashMap<String,ArrayList<Integer>> notes){
        if(numero<tests.size()){
            compteRendus.add(numero,new CompteRenduExercice(notes));
            return true;
        }
        return false;
    }
    public boolean addCompteRenduQuestion(int numero,HashMap<String,Integer> notes){
        if(numero<tests.size()){
            compteRendus.add(numero,new CompteRenduQuestion(notes));
            return true;
        }
        return false;
    }
}
