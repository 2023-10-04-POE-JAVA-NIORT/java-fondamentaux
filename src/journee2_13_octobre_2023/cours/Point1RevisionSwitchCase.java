package journee2_13_octobre_2023.cours;

import java.util.Scanner;

public class Point1RevisionSwitchCase {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Votre langue : ");
        var language=input.next();

        // Faire un test en ignorant la case
//        if(language.equalsIgnoreCase("english")){
//            System.out.println("Hello!!");
//        }else if(language.equalsIgnoreCase("french")){
//            System.out.println("Salut!!");
//        } else if(language.equalsIgnoreCase("spanish")) {
//            System.out.println("Hola!!");
//        }else if(language.equalsIgnoreCase("german")){
//            System.out.println("Guten tag");
//        }else {
//            System.out.println("Langue non supportée!!");
//        }

//        switch (language.toLowerCase()){
//            case "english":
//                System.out.println("Hello!!");
//                break;
//            case "french":
//                System.out.println("Salut!!");
//                break;
//            case "spanish":
//                System.out.println("Hola!!");
//                break;
//            case "german":
//                System.out.println("Guten tag");
//                break;
//            default:
//                System.out.println("Langue non supportée!!");
//
//        }

        switch (language.toLowerCase()){
            case "english"->System.out.println("Hello!!");

            case "french"->System.out.println("Salut!!");

            case "spanish"->System.out.println("Hola!!");

            case "german"->System.out.println("Guten tag");

            default->System.out.println("Langue non supportée!!");

        }
    }
}
