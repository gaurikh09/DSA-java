// Welcome to CodeCollab!
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int org = n;
        int rev = 1;
        int sum = 0;
        int sq=n*n;
        int place=1;
        int result=0;

        while (n != 0) {
            int lastdigit=n%10;
            result=lastdigit*place+result;
            place=place*10;
            if(org==result){
                System.out.println("Strong Number");
            }
            else{
                n=n/10;
            }


        }
    }
}