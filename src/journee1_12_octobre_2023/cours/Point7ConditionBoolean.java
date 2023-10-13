package journee1_12_octobre_2023.cours;

import java.util.Scanner;

public class Point7ConditionBoolean {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre age : ");
        var age = input.nextInt();

        // boolean isMajor=age>=18;
        // var isMajor=age>18 || age==18;
        var isMajor = age > 18;
        if (isMajor) {
            System.out.println("Ouiiii");
        } else {
            System.out.println("Désolé!!");
        }
        input.close();
    }
}
