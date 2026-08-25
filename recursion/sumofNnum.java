public class Main {

    static int sumNumbers(int n) {
        if (n==0) {
            return 0;
        }
        return n+sumNumbers(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        System.out.print(sumNumbers(n));

    }
}