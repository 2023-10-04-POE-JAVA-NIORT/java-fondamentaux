import java.util.Scanner;

public class Point4KeyboardInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Saisir l'age : ");
        int age=input.nextInt();
        System.out.printf("Age : %d",age);

//        String textNombre="17";
//        int nombre=Integer.parseInt(textNombre);
//        System.out.println(nombre);

//        System.out.print("Entrez 3 nombres : ");
//        int premierNombre=input.nextInt();
//        int deuxiemeNombre=input.nextInt();
//        int troisiemeNombre=input.nextInt();
//
//        System.out.println(premierNombre);
//        System.out.println(deuxiemeNombre);
//        System.out.println(troisiemeNombre);

//        System.out.print("Votre nom : ");
//        String firstName=input.next();
//        String lastName=input.next();

//        System.out.printf("%s %s",firstName,lastName);

//        String fullName=input.nextLine();
//        System.out.println(fullName);

        input.close();
    }
}

