package journee2_13_octobre_2023.tps;

import java.util.Scanner;

public class Tp1Parite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre = input.nextInt();
        String parite=nombre%2==0?"pair":"impair";

        if (nombre > 0) {
            System.out.printf("Le nombre est positif et %s",parite);
        } else if (nombre < 0) {
            System.out.printf("Le nombre est negatif et %s",parite);
        } else {
            System.out.printf("le chiffre est zero et %s",parite);
        }
        input.close();
    }
}
