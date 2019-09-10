package nz.ac.eit;
import java.util.Hashtable;
import java.util.Scanner;
public class Converter {
    private Hashtable<Integer, String> frenchTranslations = new Hashtable<>();
    private Hashtable<Integer, String> germanTranslations = new Hashtable<>();

    public Converter(){
        setupTranslations();
    }

    public String convert(int number, String language) {
        if(language == "german"){
            return germanTranslations.get(number);
        }else if(language == "french"){
            return frenchTranslations.get(number);
        }
        return "No Translation found";
    }


        private void setupTranslations(){
            frenchTranslations.put(1, "un");
            frenchTranslations.put(2, "deux");
            frenchTranslations.put(3, "trois");
            frenchTranslations.put(4, "quatre");
            frenchTranslations.put(5, "cinq");
            frenchTranslations.put(6, "six");
            frenchTranslations.put(7, "sept");
            frenchTranslations.put(8, "huit");
            frenchTranslations.put(9, "neuf");
            frenchTranslations.put(10, "dix");
            frenchTranslations.put(11, "onze");
            frenchTranslations.put(12, "douze");
            frenchTranslations.put(13, "treize");
            frenchTranslations.put(14, "quatorze");
            frenchTranslations.put(15, "quinze");
            frenchTranslations.put(16, "seize");
            frenchTranslations.put(17, "dix-sept");
            frenchTranslations.put(18, "dix-huit");
            frenchTranslations.put(19, "dix-neuf");
            frenchTranslations.put(20, "vingt");
            frenchTranslations.put(21, "vingt et un");
            frenchTranslations.put(22, "vingt-deux");
            frenchTranslations.put(23, "vingt-trois");
            frenchTranslations.put(24, "vingt-quatre");
            frenchTranslations.put(25, "vingt-cinq");
            frenchTranslations.put(26, "vingt-six");
            frenchTranslations.put(27, "vingt-sept");
            frenchTranslations.put(28, "tvingt-huit");
            frenchTranslations.put(29, "vingt-neuf");
            frenchTranslations.put(30, "trente");


        }


}
