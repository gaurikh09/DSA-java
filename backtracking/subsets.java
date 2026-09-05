public class Main {

    public static void findSubsets(String str, String ans, int i) {
        // base case: we've decided for every character
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // Yes choice: include str.charAt(i) in the answer
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No choice: skip str.charAt(i)
        findSubsets(str, ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);   // start with empty answer, index 0
    }
}