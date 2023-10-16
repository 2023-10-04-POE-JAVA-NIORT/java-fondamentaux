package journee3_16_octobre_2023.cours;

import java.util.Scanner;

public class Point2PoolLitteraux {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        var nom="chris";

        var nom2=input.next();

        nom2=nom2.intern();
        if (nom==nom2){
            System.out.println("Même référence");
        }else{
            System.out.println("Références différentes");
        }

        input.close();
    }
}
