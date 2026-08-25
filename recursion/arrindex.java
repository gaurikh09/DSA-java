import java.util.*;

public class Main {

    public static void index(int[] arr, int key, int i) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.println(i);
        }

        index(arr, key, i + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 5, 2, 3};
        int key = 3;

        index(arr, key, 0);
    }
}
