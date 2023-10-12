package journee1_12_octobre_2023.cours;

import java.util.Scanner;

public class Point6Conditions {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Votre age : ");
        var age=input.nextInt();

        // age = 12 => false
        // age = 21 => true

        if(age>=18){
            System.out.println("Ouiiii");
        }else{
            System.out.println("Désolé!!");
        }

//        if(age>18 || age==18){
//            System.out.println("Ouiiii");
//        }else{
//            System.out.println("Désolé!!");
//        }
    }
}
