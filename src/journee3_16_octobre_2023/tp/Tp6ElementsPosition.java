package journee3_16_octobre_2023.tp;

public class Tp6ElementsPosition {

    public static String getPositions(int[][] tab, int nombre) {

        var compteur = 0;
        var positions = "";

        for (var i = 0; i < tab.length; i++) {
            for (var j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == nombre) {
                    compteur++;
                    positions += "(" + i + "," + j + ") ";
                }
            }
        }

        if (compteur > 0) {
            return nombre + " se retrouve " + compteur + " fois dans les emplacements suivants : " + positions;
        } else {
            return nombre + " ne se trouve pas dans le tableau";
        }

    }

    public static void main(String[] args) {

        var tab =new int[][] {
                {1, 4, 2, 1},
                {6, 3, 8, 9},
                {1, 5, 1, 0}
        };

        System.out.println(getPositions(tab, 1));

    }

}