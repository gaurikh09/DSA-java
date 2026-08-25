// Welcome to CodeCollab!
import java.util.*;
public class Main {
    static boolean pallindrome(String str,int i,int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return pallindrome(str,i+1,j-1);
    }
    public static void main(String[] args) {
        String str="iruaggauri";
        System.out.print(pallindrome(str,0,str.length()-1));
    }
}
