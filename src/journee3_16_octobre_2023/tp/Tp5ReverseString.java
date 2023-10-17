package journee3_16_octobre_2023.tp;

import java.util.Scanner;

public class Tp5ReverseString {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        var chaine = scanner.nextLine();

        var chaineInverse = "";
//        Avec la boucle inverse
//        for(var i = chaine.length()-1; i >= 0; i--) {
//            chaineInverse += chaine.charAt(i);
//        }

//        Boucle classique
        for(var i = 0; i <chaine.length(); i++) {
            chaineInverse = chaine.charAt(i)+chaineInverse;
        }

        System.out.println("Chaîne inversée : " + chaineInverse);

    }
}
