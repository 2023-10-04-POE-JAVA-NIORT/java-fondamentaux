package journee3_16_octobre_2023.tp;

import java.util.Scanner;

public class Tp3SommeTableauxAvecFonctions {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau 1 : ");
        var taille1 = scanner.nextInt();
        var tab1 = new int[taille1];

        System.out.print("Entrez les éléments du tableau 1 : ");
        for(var i=0; i<taille1; i++) {
            tab1[i] = scanner.nextInt();
        }

        System.out.print("Entrez la taille du tableau 2 : ");
        var taille2 = scanner.nextInt();
        var tab2 = new int[taille2];

        System.out.print("Entrez les éléments du tableau 2 : ");
        for(var i=0; i<taille2; i++) {
            tab2[i] = scanner.nextInt();
        }

        System.out.print("Entrez la taille du tableau 3 : ");
        var taille3 = scanner.nextInt();
        var tab3 = new int[taille3];

        System.out.print("Entrez les éléments du tableau 3 : ");
        for(var i=0; i<taille3; i++) {
            tab3[i] = scanner.nextInt();
        }

        System.out.println("Tableau 1 : " + afficherTableau(tab1));
        System.out.println("Tableau 2 : " + afficherTableau(tab2));
        System.out.println("Tableau 3 : " + afficherTableau(tab3));

        var somme = sommeMultiples3(tab1) + sommeMultiples3(tab2) + sommeMultiples3(tab3);
        System.out.println("Somme des éléments multiples de 3 : " + somme);

    }

    public static String afficherTableau(int[] tab) {
        var sb = new StringBuilder("[");
        for(var i=0; i<tab.length; i++) {
            sb.append(tab[i]);
            if(i < tab.length-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static int sommeMultiples3(int[] tab) {
        var somme = 0;
        for(var element : tab) {
            if(element % 3 == 0) {
                somme += element;
            }
        }
        return somme;
    }
}
