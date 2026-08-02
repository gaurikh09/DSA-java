// Welcome to CodeCollab!
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int org = n;
        int rev = 1;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;

            for (int i = 1; i <= digit; i++) {
                rev = rev * i;
            }

            n = n / 10;
            sum = sum + rev;
            rev = 1;
        }

        if (sum == org) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong");
        }
    }
}