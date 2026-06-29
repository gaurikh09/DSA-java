import java.util.*;
public class incdec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        n++;
        m++;
        n--;
        m--;
        --m;
        --n;
        ++m;
        ++n;
        System.out.println(n);
        System.out.println(m);
    }
}
