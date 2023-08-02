package seminar2;

import seminar2.tasks.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {4, 8, 0, 3, 7, 5, 2, 9, 1, 6};
        PyramidSorting.sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}