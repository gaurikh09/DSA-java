// Welcome to CodeCollab!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Hello");
            System.out.print("Enter Y to continue: ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        System.out.println("Program terminated.");
    }
}