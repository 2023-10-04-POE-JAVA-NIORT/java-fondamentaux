public class Point2TypeText {
    public static void main(String[] args) {
        // Type string
        String first_name="Néhémie";//PEP8 -> Interdit en Java
        String FirstName="Néhémie";// Non
        String First_Name="Néhémie";// Non

        String firstName="Christian";// Camel case : Convention pour nommer des variables
        String lastName="Lisangola";
        String fullName=firstName+" "+lastName;// "Christian"+" "+"Lisangola"

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

        // Type caractère
        // Masculin => M
        char gender='M';
        System.out.println(gender);
    }
}
