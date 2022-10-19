import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class ArraysAndStringsTest {

    /**
     * 1.3
     */
    @Test
    public void testURLify() {
        char[] input = "Mr John Smith    ".toCharArray();
        int trueLength = 13;
        char[] output = "Mr%20John%20Smith".toCharArray();
        assertArrayEquals(output, ArraysAndStrings.URLify(input, trueLength));
    }

    /**
     * 1.2
     */
    @Test
    public void testCheckPermutation() {
        assertFalse(ArraysAndStrings.checkPermutation("abc", "abcde"));
        assertTrue(ArraysAndStrings.checkPermutation("god", "dog"));
        assertTrue(ArraysAndStrings.checkPermutation("Check if one string is a permutation of other.",
                "Check if other string is a permutation of one."));
        assertFalse(ArraysAndStrings.checkPermutation("Check if one string is a permutation of other.",
                "Check if other string is a permutation of one. "));
    }

    /**
     * 1.1
     */
    @Test
    public void testIsUnique() {
        assertFalse(ArraysAndStrings.isUnique("banana"));
        assertTrue(ArraysAndStrings.isUnique("abcdef"));
        assertTrue(ArraysAndStrings.isUnique(""));
    }
}
