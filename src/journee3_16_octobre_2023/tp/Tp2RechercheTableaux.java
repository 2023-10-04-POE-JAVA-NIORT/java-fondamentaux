package journee3_16_octobre_2023.tp;

import java.util.ArrayList;
import java.util.Scanner;

public class Tp2RechercheTableaux {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Entrez les éléments de la liste (stop pour arrêter) :");

        var list = new ArrayList<Integer>();

        while(true) {
            var valeur = scanner.next();
            if(valeur.equalsIgnoreCase("stop")) {
                break;
            }
            list.add(Integer.parseInt(valeur));
        }

        System.out.print("Entrez un nombre à rechercher : ");
        var nombre = scanner.nextInt();

        var compteur = 0;
        for(var element : list) {
            if(element == nombre) {
                compteur++;
            }
        }

        if(compteur > 0) {
            System.out.println(nombre + " existe et se retrouve " + compteur + " fois dans la liste");
        }
        else {
            System.out.println(nombre + " n'existe pas dans la liste");
        }

    }

}