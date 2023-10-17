package journee3_16_octobre_2023.tp;

public class Tp9ConsecutiveChars {

    public static boolean hasConsecutiveChars(String chaine) {

        for(var i = 1; i < chaine.length(); i++) {
            if(chaine.charAt(i) == chaine.charAt(i-1)) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        System.out.println(hasConsecutiveChars("terr")); // false
        System.out.println(hasConsecutiveChars("terrific")); // true
        System.out.println(hasConsecutiveChars("chats")); // false
        System.out.println(hasConsecutiveChars("chats!!")); // true

    }

}