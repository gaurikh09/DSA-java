public class Main {

    static void printNumbers(int n) {

        // Base case
        if (n > 10) {
            return;
        }

        // Print current number

        // Recursive call
        printNumbers(n + 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        printNumbers(0);

    }
}