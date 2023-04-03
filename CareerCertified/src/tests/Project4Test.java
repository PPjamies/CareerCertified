import org.junit.Assert;
import org.junit.Test;

public class Project4Test {
    private final int[] FIRST_TEN_HEXAGONAL_NUMBERS = {1, 6, 15, 28, 45, 66, 91, 120, 153, 190};

    @Test
    public void getHexagonalNumbersWithMemoTest() {
        for (int i = 0; i < FIRST_TEN_HEXAGONAL_NUMBERS.length; i++) {
            String[] args = {(i + 1) + ""};
            Assert.assertEquals(FIRST_TEN_HEXAGONAL_NUMBERS[i], Project4.getNthHexagonalNumber(args, false));
        }
    }

    @Test
    public void getHexagonalNumbersWithMathTest() {
        for (int i = 0; i < FIRST_TEN_HEXAGONAL_NUMBERS.length; i++) {
            String[] args = {(i + 1) + ""};
            Assert.assertEquals(FIRST_TEN_HEXAGONAL_NUMBERS[i], Project4.getNthHexagonalNumber(args, true));
        }
    }
}
