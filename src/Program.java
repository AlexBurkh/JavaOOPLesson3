import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Task1();
        Task2();
    }

    public static void Task1() {
        Integer[] array = new Integer[] {111, 123, 122, 400, 501};
        Arrays.sort(array, new IntegerComparator());
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void Task2() {
        MyList<Integer> myList = new MyArrayList<>();
        for (int i = 0; i < 11; i++) {
            myList.add(i);
        }
        System.out.println("via toString()");
        System.out.println(myList);
        System.out.println("via foreach");
        for (Integer i : myList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("via iterator");
        Iterator<Integer> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
