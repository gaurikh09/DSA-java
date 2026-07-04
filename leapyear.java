import java.util.Scanner;
public class leapyear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if(yr%4==0){
            if(yr%100==0){
                if(yr%400==0){
                    System.out.print("Leap Year");
                }
            }
        } 
        else {
            System.out.print("Not a Leap Year");
        }
    }
}
