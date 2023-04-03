import java.util.Stack;

public class Project2 {
    /*
     * Assumptions:
     * empty string is considered a palindrome.
     * string does not contain non-alphanumeric characters or whitespaces.
     * string does contain upper and lower-cased letters.
     */
    public static boolean isPalindrome(String s) {
        if (s == null)
            throw new NullPointerException("String cannot be null.");

        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toLowerCase().toCharArray())
            stack.push(ch);

        for (Character ch : s.toLowerCase().toCharArray())
            if (ch != stack.pop())
                return false;

        return true;
    }

    public static boolean isPalindrome2(String s) {
        if (s == null)
            throw new NullPointerException("String cannot be null.");

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
