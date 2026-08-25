public class Main {

    static void printNumbers(int n) {

        // Base case
        if (n > 10) {
            return;
        }

        // Print current number
        System.out.println(n);

        // Recursive call
        printNumbers(n + 1);
        System.out.println("Gauri"+ n);
    }

    public static void main(String[] args) {

        printNumbers(0);

    }
}