package journee2_13_octobre_2023.tps;

import java.util.Scanner;

public class Tp5TableMulti {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrez le nombre dont vous souhaitez afficher la table de multiplication : ");
        var number=input.nextInt();

        System.out.print("Borne inférieure: ");
        var start=input.nextInt();

        System.out.print("Borne supérieure: ");
        var end=input.nextInt();

        if(start>end){
            var temp=start;
            end=start;
            start=temp;
        }

        System.out.println("**********************************");
        System.out.printf("** Table de multiplication de %d **",number);
        System.out.println("**********************************");
        for(var i=start;i<=end;i++){
            System.out.printf("%d x %d = %d",number,i,(number*i));
        }
    }
}
