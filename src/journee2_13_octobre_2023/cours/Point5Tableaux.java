package journee2_13_octobre_2023.cours;

public class Point5Tableaux {
    public static void main(String[] args) {
        // Avant arrays
//        var note1=12.0;
//        var note2=9.0;
//        var note3=14.0;
//        var note4=19.0;
//        var note5=2.0;
//        var note6=12.0;
//        var note7=9.0;
//        var note8=14.0;
//        var note9=19.0;
//        var note10=2.0;
//
//        var sommeNotesPhysique=note1+note2+note3+note4+note5;
//        var moyenne=sommeNotesPhysique/5;
//
//        System.out.println("Somme : "+sommeNotesPhysique);
//        System.out.println("Moyenne : "+moyenne);

        // Avec tableaux
        double[] notesPhysique={2,3,4,5,6};// taille : 5

        var tailleTab=6;
        double notesPhysique2[]=new double[tailleTab];// {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}

        System.out.println("Physique");
        System.out.println(notesPhysique[0]);
        System.out.println(notesPhysique[1]);
        System.out.println(notesPhysique[2]);
        System.out.println(notesPhysique[3]);
        System.out.println(notesPhysique[4]);

        notesPhysique[0]=23;
        System.out.println("Index 0 :"+notesPhysique[0]);

        var notesChimie=notesPhysique;
        System.out.println("Chimie");
        System.out.println(notesChimie[0]);
        System.out.println(notesChimie[1]);
        System.out.println(notesChimie[2]);
        System.out.println(notesChimie[3]);
        System.out.println(notesChimie[4]);

        notesChimie[0]=670;

        System.out.println("notePhysique[0] : "+notesPhysique[0]);

        if(notesChimie==notesPhysique){
            System.out.println("Ouiii");
        }else{
            System.out.println("Noonn");
        }

    }
}
