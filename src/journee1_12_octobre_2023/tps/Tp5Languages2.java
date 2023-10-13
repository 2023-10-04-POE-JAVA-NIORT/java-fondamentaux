package journee1_12_octobre_2023.tps;

import java.util.Scanner;

public class Tp5Languages2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre langue : ");
        var language = input.next();

        // Switch case : Approche classique
        switch (language.toLowerCase()) {
            case "english":
                System.out.println("Hello!!");
                break;
            case "french":
                System.out.println("Salut!!");
                break;
            case "spanish":
                System.out.println("Hola!!");
                break;
            case "german":
                System.out.println("Guten tag");
                break;
            default:
                System.out.println("Langue non supportée!!");
        }
        input.close();
    }
}
