package journee3_16_octobre_2023.cours;

public class Point6Fonctions2 {
    // API : Application programming interface
    static double calculSomme(double[] notes){
        var somme=0.0;
        for(var note:notes){
            somme +=note;
        }
        return  somme;
    }


    // paramètre :
    //   - somme(résultat) de l'appel prédécent
    //   - 2 param : somme et taille
    //   - tableau notes
    //   -
    static double calculMoyenne(double somme,int taille){
        return  somme/taille;
    }

    static void afficherStatistiques(double[] notes,String cours){
        var somme=calculSomme(notes);
        var moyenne=calculMoyenne(somme,notes.length);
        System.out.printf("Somme %s : %.2f\n",cours,somme);
        System.out.printf("Moyenne %s : %.2f\n",cours,moyenne);
    }
    public static void main(String[] args) {
        var notesPhysique=new double[]{12,13,14,15,9};
        afficherStatistiques(notesPhysique,"Physique");



        var notesHistoire=new double[]{12,13,14,15,9,3,8,19};
        afficherStatistiques(notesHistoire,"Histoire");


        var notesGeometrie=new double[]{12,13,14,15,9,1,2,2,9};
        afficherStatistiques(notesGeometrie,"Géométrie");
    }
}
