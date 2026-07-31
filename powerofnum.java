import java.util.Scanner;
public class powerofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int j=1;
        for(int i=1;i<=p;i++){
            j=j*n;
        }
        System.out.print(j);  
    }
}
