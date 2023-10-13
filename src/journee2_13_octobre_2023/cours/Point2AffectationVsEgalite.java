package journee2_13_octobre_2023.cours;

import java.util.Scanner;

public class Point2AffectationVsEgalite {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

//        System.out.print("Votre age : ");
//        var age=input.nextInt();

//        if(age==18){
//            System.out.println("Nouveau majeur");
//        }else{
//            System.out.println("T'es qui toi???");
//        }

        System.out.print("Distance : ");
        var distanceParcourue=input.nextDouble();

        System.out.print("Temps : ");
        var temps=input.nextDouble();

        var vitesse=distanceParcourue/temps;
        System.out.println("Vitesse : "+vitesse);

        // Nouvelle valeur pour le temps
        System.out.print("Temps : ");
        temps=input.nextDouble();

    }
}
