import java.util.List;

public class Utils {
    public static boolean isEmpty(int[] arr) {
        return arr == null || arr.length == 0;
    }

    public static void printLists(List<List<Integer>> lists) {
        System.out.print("{");
        for (List<Integer> list : lists)
            printList(list);
        System.out.println("}");
    }

    public static void printList(List<Integer> list) {
        System.out.print("{ ");
        for (Integer item : list)
            System.out.print(item + " ");
        System.out.print("}");
    }
}
