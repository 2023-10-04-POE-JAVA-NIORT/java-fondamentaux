package journee2_13_octobre_2023.tps;

import java.util.Scanner;

public class Tp1Parite {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        var number = input.nextInt();
        String parity=number%2==0?"pair":"impair";

        if (number > 0) {
            System.out.printf("%d est positif et %s",number,parity);
        } else if (number < 0) {
            System.out.printf("%d est negatif et %s",number,parity);
        } else {
            System.out.printf("le chiffre est zero et %s",parity);
        }
        input.close();
    }
}
