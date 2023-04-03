import org.junit.Assert;
import org.junit.Test;

public class Project2Test {
    private final String[] PALINDROMES = {
            "",
            "a",
            "aa",
            "Aa",
            "AA",
            "aaa",
            "aba",
            "aaaa",
            "aabAa"
    };

    private final String[] NON_PALINDROMES = {
            "ab",
            "bca",
            "bba",
            "bbcb"
    };

    @Test(expected = NullPointerException.class)
    public void isPalindromeTest() {
        for (String palindrome : PALINDROMES)
            Assert.assertTrue(Project2.isPalindrome(palindrome));

        for (String nonPalindrome : NON_PALINDROMES)
            Assert.assertFalse(Project2.isPalindrome(nonPalindrome));

        Project2.isPalindrome(null);
    }

    @Test(expected = NullPointerException.class)
    public void isPalindrome2Test() {
        for (String palindrome : PALINDROMES)
            Assert.assertTrue(Project2.isPalindrome2(palindrome));

        for (String nonPalindrome : NON_PALINDROMES)
            Assert.assertFalse(Project2.isPalindrome2(nonPalindrome));

        Project2.isPalindrome(null);
    }
}
