package journee3_16_octobre_2023.tp;

import java.util.Arrays;

public class Tp7Alternate {

    public static char[] alternate(char[] tab) {

        for (var i = 0; i < tab.length; i++) {
            if (i % 2 != 0) {
                tab[i] = Character.toUpperCase(tab[i]);
            }
        }

        return tab;

    }

    public static void main(String[] args) {

        var tab = new char[]{'a', 'b', 'c', 'd', 'e'};
        var tabAlternance = alternate(tab);

        System.out.print("[");
        for(var i = 0; i < tabAlternance.length; i++) {
            System.out.print(tabAlternance[i]);
            if(i < tabAlternance.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // On peut aussi utiliser Arrays.toString
        System.out.println(Arrays.toString(tabAlternance));

    }

}