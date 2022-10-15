public class ArraysAndStrings {
    /**
     * 1.2 Check if one string is a permutation of other. *
     * 
     * @param str1
     * @param str2
     * @return true when str2 is a permutation of str1.
     */
    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] letters = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++;
            letters[str2.charAt(i)]--;
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 1.1 Check is a string has only unique characters. *
     * 
     * @param str
     * @return true when there is no repeated character.
     */
    public static boolean isUnique(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] charAt = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char asciiValue = str.charAt(i);
            if (charAt[asciiValue]) {
                return false;
            }
            charAt[asciiValue] = true;
        }
        return true;
    }
}
