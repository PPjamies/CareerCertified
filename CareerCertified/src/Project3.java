import java.util.*;

public class Project3 {
    /*
     * Assumptions:
     * array can contain negative numbers.
     * array does not contain duplicate numbers.
     * print combinations of two.
     */
    private static List<List<Integer>> findCombinationsOfTwoThatAddUpToN(int[] arr, int N) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int diff = N - num;
            if (seen.contains(diff))
                res.add(List.of(num, diff));
            else
                seen.add(num);
        }

        return res;
    }

    public static List<List<Integer>> getCombinationsOfTwoThatAddUpToN(int[] arr, int N) { // getters for testing private method
        if (Utils.isEmpty(arr))
            throw new NullPointerException("List of numbers cannot be empty or null.");
        return findCombinationsOfTwoThatAddUpToN(arr, N);
    }

    public static void printCombinationsOfTwoThatAddUpToN(int[] arr, int N) {
        Utils.printLists(getCombinationsOfTwoThatAddUpToN(arr, N));
    }

    /*
     * Assumptions:
     * array cannot contain negative numbers.
     * array does not contain duplicate numbers.
     * numbers in array can be used unlimited amount of times.
     */
    private static List<List<Integer>> findCombinationsThatAddUpToN(int[] arr, int N, int index, List<Integer> out, List<List<Integer>> res) {
        if (index == arr.length) {
            if (N == 0)
                res.add(new ArrayList<>(out));
            return res;
        }

        if (arr[index] <= N) {
            out.add(arr[index]);
            findCombinationsThatAddUpToN(arr, N - arr[index], index, out, res);
            out.remove(out.size() - 1);
        }

        findCombinationsThatAddUpToN(arr, N, index + 1, out, res);
        return res;
    }

    public static List<List<Integer>> getCombinationsThatAddUpToN(int[] arr, int N) {
        if (Utils.isEmpty(arr))
            throw new NullPointerException("List of numbers cannot be empty or null.");
        return findCombinationsThatAddUpToN(arr, N, 0, new ArrayList<>(), new ArrayList<>());
    }

    public static void printCombinationsThatAddUpToN(int[] arr, int N) {
        Utils.printLists(getCombinationsThatAddUpToN(arr, N));
    }

    /*
     * Assumptions:
     * array can contain negative numbers.
     * array does not contain duplicate numbers.
     * numbers in array cannot be used unlimited amount of times.
     */
    private static List<List<Integer>> findCombinationsThatAddUpToTargetN(int[] arr, int N, int start, int end, int index, int sum, List<Integer> out, List<List<Integer>> res) {
        if (index == arr.length)
            return res;

        if (sum == N)
            res.add(new ArrayList<>(out));

        for (int i = start; i < end; i++) {
            out.add(index, arr[i]);
            sum += out.get(index);
            findCombinationsThatAddUpToTargetN(arr, N, i + 1, end, index + 1, sum, out, res);
            sum -= out.get(index);
            out.remove(index);
        }

        return res;
    }

    public static List<List<Integer>> getCombinationsThatAddUpToTargetN(int[] arr, int N) {
        if (Utils.isEmpty(arr))
            throw new NullPointerException("List of numbers cannot be empty or null.");
        return findCombinationsThatAddUpToTargetN(arr, N, 0, arr.length, 0, 0, new ArrayList<>(), new ArrayList<>());
    }

    public static void printCombinationsThatAddUpToTargetN(int[] arr, int N) {
        Utils.printLists(getCombinationsThatAddUpToTargetN(arr, N));
    }
}
