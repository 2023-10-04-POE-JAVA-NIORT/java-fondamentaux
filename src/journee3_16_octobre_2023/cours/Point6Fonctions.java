package journee3_16_octobre_2023.cours;

public class Point6Fonctions {
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


    public static void main(String[] args) {
        var notesPhysique=new double[]{12,13,14,15,9};
        var sommePhysique=calculSomme(notesPhysique);
        var moyennePhysique=calculMoyenne(sommePhysique,notesPhysique.length);
        System.out.printf("Somme physique : %.2f\nMoyenne physique : %.2f\n\n",sommePhysique,moyennePhysique);



        var notesHistoire=new double[]{12,13,14,15,9,3,8,19};
        var sommeHistoire=calculSomme(notesHistoire);
        var moyenneHistoire=calculMoyenne(sommeHistoire,notesHistoire.length);
        System.out.printf("Somme histoire : %.2f\nMoyenne histoire : %.2f\n\n",sommeHistoire,moyenneHistoire);



        var notesGeometrie=new double[]{12,13,14,15,9,1,2,2,9};
        var sommeGeometrie=calculSomme(notesGeometrie);
        var moyenneGeometrie=calculMoyenne(sommeGeometrie,notesGeometrie.length);
        System.out.printf("Somme géometrie : %.2f\nMoyenne geometrie : %.2f\n\n",sommeGeometrie,moyenneGeometrie);
    }
}
