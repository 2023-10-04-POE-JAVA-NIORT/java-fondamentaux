package journee2_13_octobre_2023.cours;

public class Point3BoucleFor {
    public static void main(String[] args) {
//
//        System.out.printf("Le carré de 2 est %.1f\n",Math.pow(2,2));
//        System.out.printf("Le carré de 3 est %.1f\n",Math.pow(3,2));
//        System.out.printf("Le carré de 4 est %.1f\n",Math.pow(4,2));
//        System.out.printf("Le carré de 5 est %.1f\n",Math.pow(5,2));
//        System.out.printf("Le carré de 6 est %.1f\n",Math.pow(6,2));
//        System.out.printf("Le carré de 7 est %.1f\n",Math.pow(7,2));
//        System.out.printf("Le carré de 8 est %.1f\n",Math.pow(8,2));
//        System.out.printf("Le carré de 9 est %.1f\n",Math.pow(9,2));
//        System.out.printf("Le carré de 10 est %.1f\n",Math.pow(10,2));

        // nombre = nombre + 1 <=> nombre +=1 <=> nombre++ ou ++nombre
        // nombre = nombre + 2 <=> nombre +=2
        for(int nombre=2;nombre<=11;nombre++){
            System.out.printf("Le carré de %d est %.1f\n",nombre,Math.pow(nombre,2));
        }

        // post incrementation
        // 1. on affecte l'ancienne valeur de "a" à  "b", ce qui est donc "2"
        // 2. On incremente "a", qui devient 3
//        int a=2;
//        int b=a++;
//        System.out.println(a);// 3
//        System.out.println(b);// 2

        // pre incrementation
        // 1. On incremente la valeur de "a", qui devient 3
        // 2. On affecte à b, cette nouvelle valeur qui est "3"
//        int a=2;
//        int b=++a;
//        System.out.println(a);// 3
//        System.out.println(b);// 3
    }
}
