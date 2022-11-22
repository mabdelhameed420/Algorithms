import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("--array before counting sort--");
        System.out.println(Arrays.toString(data));
        CountingSort.countingSort(data, data.length);
        System.out.println("--array after counting sort--");
        System.out.println(Arrays.toString(data));
    }
}