package journee3_16_octobre_2023.cours;

import java.util.Scanner;

public class Point1DoWhile {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Veuillez entrer un nouveau code Pin : ");
        var codePin=input.nextInt();

        var codePinATester=1234;

        do{
            System.out.print("Veuillez entrer le code Pin pour débloquer l'appareil : ");
            codePinATester=input.nextInt();
        }while (codePinATester!=codePin);

        System.out.println("Appareil débloqué");
    }
}
