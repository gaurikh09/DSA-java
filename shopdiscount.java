import java.util.Scanner;
public class shopdiscount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int discount=sc.nextInt();
        int finalprice=price-(price*discount/100);
        System.out.println(finalprice);
    }
}