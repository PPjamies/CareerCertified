import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Project3Test {
    private final int[] SEQUENCE = {1, 9, 10, 5, -1, 11};
    private final int N = 10;

    @Test(expected = NullPointerException.class)
    public void getCombinationsOfTwoThatAddUpToNTest() {
        // print
        Project3.printCombinationsOfTwoThatAddUpToN(SEQUENCE, N);

        // test
        for (List<Integer> combination : Project3.getCombinationsOfTwoThatAddUpToN(SEQUENCE, N)) {
            int sum = combination.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            Assert.assertEquals(N, sum);
        }
        Project3.getCombinationsOfTwoThatAddUpToN(null, N);
    }

    @Test(expected = NullPointerException.class)
    public void getCombinationsThatAddUpToNTest() {
        int[] arr = {1, 2, 3};

        // print
        Project3.printCombinationsThatAddUpToN(arr, N);

        // test
        for (List<Integer> combination : Project3.getCombinationsThatAddUpToN(arr, N)) {
            int sum = combination.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            Assert.assertEquals(N, sum);
        }
        Project3.getCombinationsThatAddUpToN(null, N);
    }

    @Test(expected = NullPointerException.class)
    public void getCombinationsThatAddUpToTargetNTest() {
        // print
        Project3.printCombinationsThatAddUpToTargetN(SEQUENCE, N);

        // test
        for (List<Integer> combination : Project3.getCombinationsThatAddUpToTargetN(SEQUENCE, N)) {
            int sum = combination.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            Assert.assertEquals(N, sum);
        }
        Project3.getCombinationsThatAddUpToTargetN(null, N);
    }
}
