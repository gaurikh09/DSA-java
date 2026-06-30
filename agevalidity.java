import java.util.*;
public class agevalidity {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>18){
            System.out.print("eligible");
        }
        else{
            System.out.print("not eligible");
        }
    }
}