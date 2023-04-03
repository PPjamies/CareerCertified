public class Project4 {
    /*
     * Assumptions:
     * the number is passed in as the first command line argument.
     */

    /*
    +-------------------------------------+
    | n |  hex num  |  diff  |  diff (2nd)|
    |---|-----------|--------|------------|
    | 1 |     1     |   5    |  4         |
    |---|-----------|--------|------------|
    | 2 |     6     |   9    |  4         |
    |---|-----------|--------|------------|
    | 3 |     15    |   13   |  4         |
    |---|-----------|--------|------------|
    | 4 |     28    |   17   |  4         |
    |---|-----------|--------|------------|
    | 5 |     45    |   21   |  4         |
    |---|-----------|--------|------------|
    | 6 |     66    |   25   |  4         |
    +-------------------------------------+
    */
    private static int getNthHexagonalNumberWithMemo(int n) {
        if (n <= 0) return 0;

        int[] hexagonalNumbers = new int[n];
        hexagonalNumbers[0] = 1;

        int[] differenceBetweenHexagonalNumbers = new int[n];
        differenceBetweenHexagonalNumbers[0] = 5;

        for (int i = 1; i < n; i++) {
            hexagonalNumbers[i] = hexagonalNumbers[i - 1] + differenceBetweenHexagonalNumbers[i - 1];
            differenceBetweenHexagonalNumbers[i] = differenceBetweenHexagonalNumbers[i - 1] + 4;
        }

        return hexagonalNumbers[n - 1];
    }

    private static int getNthHexagonalNumberWithMath(int n) {
        return n * (2 * n - 1);
    }

    public static int getNthHexagonalNumber(String[] args, boolean useMath) {
        try {
            int n = Integer.parseInt(args[0]);
            if (useMath)
                return getNthHexagonalNumberWithMath(n);
            else
                return getNthHexagonalNumberWithMemo(n);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
