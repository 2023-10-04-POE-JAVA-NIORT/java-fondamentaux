package journee3_16_octobre_2023.tp;

public class Tp8Directions {

    public static int[] directions(String[] directions) {

        int x = 0;
        int y = 0;

        for(String direction : directions) {
            switch(direction) {
                case "haut"->y++;

                case "bas"->y--;

                case "gauche"->x--;

                case "droite"->x++;
            }
        }

        return new int[] {x, y};
    }

    public static void main(String[] args) {
        String[] tabDirections = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int[] positionFinale = directions(tabDirections);
        System.out.println(positionFinale[0] + "," + positionFinale[1]);
    }

}