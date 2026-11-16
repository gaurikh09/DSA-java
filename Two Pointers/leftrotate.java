import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] ns=new int[n];
        int rot=k;
        for(int i=0;i<n-k;i++){
            ns[i]=arr[rot];
            rot++;
        }
        int a=0;
        for(int i=n-k;i<n;i++){
            ns[i]=arr[a];
            a++;
        }
        for (int i = 0; i <n; i++) {
            System.out.print(ns[i] + " ");
        }
    }
}