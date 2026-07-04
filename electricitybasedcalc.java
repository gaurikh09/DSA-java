import java.util.Scanner;
public class electricitybasedcalc {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int cost=0;
        int unit =sc.nextInt();
        if(unit<=100){
            cost=0;
        }
        else if(unit>100 && unit<=200){
            cost=(unit-100)*5;
        }
        else if(unit>200 && unit<=300){
            unit=unit-200;
            cost=100*5 + unit*8;
        }
        else if(unit>300){
            unit=unit-300;
            cost=100*5 + 100*8 + unit*12;
        }
        else{
            System.out.print("Not valid");
        }
        System.out.print(cost);
    }
}
