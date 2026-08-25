public class Main {
    static String[] words = {
        "Zero", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine"
    };
    public static void numberToEnglish(int n) {
        if (n == 0) {
            return;
        }
        numberToEnglish(n / 10);
        System.out.print(words[n % 10] + " ");
    }
    public static void main(String[] args) {
        int n = 2019;
        numberToEnglish(n);
    }
}