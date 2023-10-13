package journee2_13_octobre_2023.cours;

import java.util.Scanner;

public class Point4BoucleWhileCodePinV2 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Veuillez entrer un nouveau code Pin : ");
        var codePin=input.nextInt();

        var codePinATester=0;

        // 1234 != 1234
        while (true){
            System.out.print("Veuillez entrer le code Pin pour débloquer l'appareil : ");
            codePinATester=input.nextInt();

            // 123 = 1234
            if(codePinATester==codePin){
               break;
            }else{
                System.out.println("Code Pin incorrect, veuillez ressayer");
            }
        }

        System.out.println("Appareil débloqué");
    }
}
