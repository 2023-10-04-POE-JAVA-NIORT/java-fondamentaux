package journee1_12_octobre_2023.cours;

public class Point3Affichage {
    public static void main(String[] args) {
        String firstName="Christian";
        String lastName="Lisangola";
        int age=21;
        double weight=34.5;
        System.out.println("Je m'appelle "+firstName+" "+lastName+", j'ai "+age+" ans et pèse "+weight+" kg.");
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et pèse %f kg.\n",firstName,lastName,age,weight);
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et pèse %.1f kg.\n",firstName,lastName,age,weight);
    }
}

// String nom="+33"
// int age=christian
