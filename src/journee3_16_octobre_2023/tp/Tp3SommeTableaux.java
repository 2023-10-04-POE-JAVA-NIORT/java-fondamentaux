package journee3_16_octobre_2023.tp;

import java.util.Scanner;

public class Tp3SommeTableaux {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau 1 : ");
        var taille1 = scanner.nextInt();
        var tab1 = new int[taille1];

        System.out.print("Entrez les éléments du tableau 1 : ");
        for(var i = 0; i < taille1; i++) {
            tab1[i] = scanner.nextInt();
        }

        System.out.print("Entrez la taille du tableau 2 : ");
        var taille2 = scanner.nextInt();
        var tab2 = new int[taille2];

        System.out.print("Entrez les éléments du tableau 2 : ");
        for(var i = 0; i < taille2; i++) {
            tab2[i] = scanner.nextInt();
        }

        System.out.print("Entrez la taille du tableau 3 : ");
        var taille3 = scanner.nextInt();
        var tab3 = new int[taille3];

        System.out.print("Entrez les éléments du tableau 3 : ");
        for(var i = 0; i < taille3; i++) {
            tab3[i] = scanner.nextInt();
        }

        var sb1 = new StringBuilder("[");
        for(var i = 0; i < tab1.length; i++) {
            sb1.append(tab1[i]);
            if(i < tab1.length-1) {
                sb1.append(", ");
            }
        }
        sb1.append("]");
        System.out.println("Tableau 1 : " + sb1);

        var sb2 = new StringBuilder("[");
        for(var i = 0; i < tab2.length; i++) {
            sb2.append(tab2[i]);
            if(i < tab2.length-1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        System.out.println("Tableau 2 : " + sb2);

        var sb3 = new StringBuilder("[");
        for(var i = 0; i < tab3.length; i++) {
            sb3.append(tab3[i]);
            if(i < tab3.length-1) {
                sb3.append(", ");
            }
        }
        sb3.append("]");
        System.out.println("Tableau 3 : " + sb3);

        var somme = 0;
        for(var element : tab1) {
            if(element % 3 == 0) {
                somme += element;
            }
        }

        for(var element : tab2) {
            if(element % 3 == 0) {
                somme += element;
            }
        }

        for(var element : tab3) {
            if(element % 3 == 0) {
                somme += element;
            }
        }

        System.out.println("Somme des éléments multiples de 3 : " + somme);

    }

}