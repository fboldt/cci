import java.util.Arrays;

public class ArraysAndStrings {
    
    /**
     * 1.1 Check is a string has only unique characters.
     * 
     * @param str
     *            String to be checked
     * @return
     *         true when there is no repeated character
     */
    public static boolean isUnique(String str) {
        char[] sorted = str.toCharArray(); // O(n)
        Arrays.sort(sorted); // O(n log n) <---dominant
        for (int i = 0; i < sorted.length - 1; i++) { // O(n)
            if (sorted[i] == sorted[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
