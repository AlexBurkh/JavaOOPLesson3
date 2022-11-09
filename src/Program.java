import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Task1();

    }

    public static void Task1() {
        Integer[] array = new Integer[] {111, 123, 122, 400, 501};
        Arrays.sort(array, new IntegerComparator());
        for (int i : array) {
            System.out.println(i);
        }
    }
}
