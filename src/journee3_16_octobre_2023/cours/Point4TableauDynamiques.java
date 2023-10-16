package journee3_16_octobre_2023.cours;

import java.util.ArrayList;

public class Point4TableauDynamiques {
    public static void main(String[] args) {
        ArrayList<Integer> notes=new ArrayList<>();
        System.out.println("Taille : "+notes.size());

        notes.add(5);
        notes.add(10);

        System.out.println("Taille après insertions: "+notes.size());

        System.out.println("Premier element : "+notes.get(0));
        System.out.println("Dernier element : "+notes.get(1));

    }
}
