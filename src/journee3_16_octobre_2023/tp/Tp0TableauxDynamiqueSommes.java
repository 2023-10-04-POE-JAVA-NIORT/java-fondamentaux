package journee3_16_octobre_2023.tp;

import java.util.ArrayList;
import java.util.Scanner;

public class Tp0TableauxDynamiqueSommes {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Combien de notes souhaitez-vous saisir: ");
        var nombreNotes=input.nextInt();

        ArrayList<Double> notes=new ArrayList<>();
        System.out.println("Taille : "+notes.size());

        for(int i=0;i<nombreNotes;i++){
            System.out.printf("Saisir la note numer %d : ",(i+1));
            double valeur=input.nextDouble();
            notes.add(valeur);
        }

//        System.out.println(notes);
        double somme=0.0;
        for(int i=0;i<notes.size();i++){
//            somme=somme+notes.get(i);
            somme +=notes.get(i);// i=0 notes.get(0) > 12 ; i=1 notes.get(1) > 13; i=2 notes.get(2) > 14
        }
        double moyenne=somme/notes.size();
        System.out.println("Somme : "+somme);
        System.out.println("Moyenne : "+moyenne);
    }
}
