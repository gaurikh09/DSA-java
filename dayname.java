import java.util.*;
public class dayname {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==1){
            System.out.print("Monday");
        }else if(num==2){
            System.out.print("Tuesday");
        }
        else if(num==3){
            System.out.print("Wednesday");
        }
        else if(num==4){
            System.out.print("Thursday");
        }
        else if(num==5){
            System.out.print("Friday");
        }
        else if(num==6){
            System.out.print("Saturday");
        }
        else if(num==7){
            System.out.print("Friday");
        }
        else{
            System.out.print("Invalid number");
        }
    }
}
