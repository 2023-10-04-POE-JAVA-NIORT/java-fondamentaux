package journee3_16_octobre_2023.tp;

import java.util.ArrayList;
import java.util.Scanner;

public class Tp1NotesCours {
    public static void main(String[] args) {
        // 1. Demander la taille du tableau à l'utilisateur. Tant que la valeur n'est correcte, il faut recommencer l'opération
        // 2. Limiter les valeurs entre 0 et 20.
        // 3. Calculer la somme et la moyenne des notes

        var input=new Scanner(System.in);
        var nombreNotes=0;
        do{
            System.out.print("Combien de notes souhaitez-vous insérer : ");
            nombreNotes=input.nextInt();
            if(nombreNotes>0){
                break;
            }
            System.out.println("La valeur doit être > 0.");


        }while (true);

        var notesPhysique=new double[nombreNotes];

        for(var i=0;i<notesPhysique.length;i++){
           do{
               System.out.printf("Entrer la note[%d] : ",(i+1));
               var note=input.nextDouble();
               if(note>=0 && note<=20){
                   notesPhysique[i]=note;
                   break;
               }
               System.out.println("La not doit être dans [0,20].");
           }while (true);
        }

        // Calcul de la somme
        var somme=0.0;
        for(var note:notesPhysique){
            somme +=note;// somme = somme + note
        }

        // Calcul de la moyenne
        var moyenne=somme/notesPhysique.length;

        System.out.printf("Somme : %.2f\nMoyenne : %.2f",somme,moyenne);

        input.close();


    }
}
