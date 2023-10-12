package journee1_12_octobre_2023.cours;

import java.util.Scanner;

public class Point8AlternativesMultiples {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Votre langue : ");
        var language=input.next();

        if(language.equals("english")){
            System.out.println("Hello!!");
        }else if(language.equals("french")){
            System.out.println("Salut!!");
        } else if(language.equals("spanish")) {
            System.out.println("Hola!!");
        }else if(language.equals("german")){
            System.out.println("Guten tag");
        }else {
            System.out.println("Langue non supportée!!");
        }
    }
}

// 1. S'assurer que les tests ne soient pas sensibles à la casse
// 2. Réecrire ce programme en utilisant le switch case