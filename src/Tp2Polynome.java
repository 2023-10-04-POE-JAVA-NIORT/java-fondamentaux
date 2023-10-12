import java.util.Scanner;

public class Tp2Polynome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez a (int) : ");
        double a = input.nextDouble();

        System.out.print("Entrez b (int) : ");
        double b = input.nextDouble();

        System.out.print("Entrez c (int) : ");
        double c = input.nextDouble();

        System.out.print("Entrez x (double) : ");
        double x = input.nextDouble();

        double resultat = ((a + b) / 2) * Math.pow(x, 3) + Math.pow((a + b), 2) * Math.pow(x, 2) + a + b + c;

        System.out.println("La valeur du polynôme est : " + resultat);
    }
}
