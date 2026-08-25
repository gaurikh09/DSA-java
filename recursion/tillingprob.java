public class Main {

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = tilingProblem(n - 1);
        int horizontal = tilingProblem(n - 2);

        return vertical + horizontal;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(tilingProblem(n));
    }
}
