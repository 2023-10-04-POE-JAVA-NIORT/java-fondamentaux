package journee3_16_octobre_2023.cours;

public class Point7ExoSommeDiagonales {
    // Big O
    // O(n2)
    static int calculSommeDiagonale(int[][] matriceCarree){
        var somme=0;
        for(var i=0;i<matriceCarree.length;i++){
            for(var j=0;j<matriceCarree[i].length;j++){
                if(i==j){
                    somme +=matriceCarree[i][j];//[0][1]
                }
            }
        }
        return somme;
    }

    // O(n)
    static int calculSommeDiagonaleOptimise(int[][] matriceCarree){
        var somme=0;
        for(var i=0;i<matriceCarree.length;i++){
            somme+=matriceCarree[i][i];//i=2 [2][2]
        }
        return  somme;
    }
    public static void main(String[] args) {
        int[][] matriceCarre={
                {2,5,6},
                {3,1,9},
                {7,4,8}
        };
        var sommeDiagonale=calculSommeDiagonale(matriceCarre);
        System.out.println(sommeDiagonale);
    }
}
