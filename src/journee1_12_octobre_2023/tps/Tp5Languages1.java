package journee1_12_octobre_2023.tps;

import java.util.Scanner;

public class Tp5Languages1 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Votre langue : ");
        var language=input.next();

        // Faire un test en ignorant la case
        if(language.equalsIgnoreCase("english")){
            System.out.println("Hello!!");
        }else if(language.equalsIgnoreCase("french")){
            System.out.println("Salut!!");
        } else if(language.equalsIgnoreCase("spanish")) {
            System.out.println("Hola!!");
        }else if(language.equalsIgnoreCase("german")){
            System.out.println("Guten tag");
        }else {
            System.out.println("Langue non supportée!!");
        }
    }
}
