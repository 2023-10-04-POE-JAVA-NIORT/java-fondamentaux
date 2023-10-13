package journee2_13_octobre_2023.cours;

import java.util.Scanner;

public class Point6StringTableaux {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        String nom="chris";
        String nom2="chris";

        if(nom==nom2){
            System.out.println("Egaux");
        }

        if(nom.equals(nom2)){
            System.out.println("Egaux 2");
        }


        System.out.print("Votre nom:");
        String nom3=input.nextLine();

        if(nom.equals(nom3)){
            System.out.println("nom et nom3 sont égaux");
        }else {
            System.out.println("nom et nom3 ne sont pas égaux");
        }
    }
}
