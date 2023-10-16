package journee3_16_octobre_2023.cours;

import java.util.Scanner;

public class Point3TableauxEtBoucles {
    public static void main(String[] args) {
        // 1. Demander la taille du tableau à l'utilisateur. Tant que la valeur n'est correcte, il faut recommencer l'opération
        // 2. Limiter les valeurs entre 0 et 20.
        // 3. Calculer la somme et la moyenne des notes


        Scanner input=new Scanner(System.in);
        double[] notesPhysique=new double[5];

        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("Entrer la note[%d] : ",(i+1));
            notesPhysique[i]=input.nextDouble();
        }


        System.out.println("Physique");
        for(double note:notesPhysique){
            System.out.println(note);
        }

//       Mauvaise pratique parce qu'on a plusieurs styles différents dans le même programme
//
//        for(int i=0;i<notesPhysique.length;i++){
//            System.out.println(notesPhysique[i]);
//        }
//
//
//        for(int i=0;i<=notesPhysique.length-1;i++){
//            System.out.println(notesPhysique[i]);
//        }
//


    }
}
