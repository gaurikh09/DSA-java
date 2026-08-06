// Welcome to CodeCollab!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int greatest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
            else{
                i++;
            }
        }
        System.out.print(greatest);
    }
}
