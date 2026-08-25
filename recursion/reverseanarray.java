// Welcome to CodeCollab!
import java.util.*;

public class Main {

    static void reversearr(int[] arr, int i, int j) {

        if (i >= j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reversearr(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 4, 9, 6};

        int n = arr.length;

        reversearr(arr, 0, n - 1);

        System.out.print(Arrays.toString(arr));
    }
}