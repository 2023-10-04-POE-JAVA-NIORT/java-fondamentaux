package journee3_16_octobre_2023.tp;

import java.util.Random;

public class Tp1NotesCoursWithRandom {
    public static void main(String[] args) {
        var random = new Random();

        // Génération aléatoire du nombre de notes entre 2 et 8
        var nombreNotes = random.nextInt(7) + 2;

        var notesPhysique = new double[nombreNotes];

        // Génération aléatoire des notes entre 0 et 20
        for (var i = 0; i < nombreNotes; i++) {
            var note = random.nextDouble() * 20;
            notesPhysique[i] = note;
        }

        // Calcul de la somme
        var somme=0.0;
        for(var note:notesPhysique){
            somme +=note;
        }

        // Calcul de la moyenne
        var moyenne=somme/notesPhysique.length;

        System.out.printf("Somme : %.2f\nMoyenne : %.2f",somme,moyenne);
    }
}
