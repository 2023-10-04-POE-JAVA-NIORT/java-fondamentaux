package journee3_16_octobre_2023.tp;

import java.util.Scanner;

public class Tp5ReverseStringSolutionStringBuilder {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        var chaine = scanner.nextLine();

        var sb = new StringBuilder(chaine);
        sb.reverse();
        var chaineInverse = sb.toString();
        System.out.println("Chaîne inversée : " + chaineInverse);
    }
}
