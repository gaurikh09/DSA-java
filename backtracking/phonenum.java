import java.util.*;

public class Main {
    public static void find(String digits,int index,String curr,List<String> ans) {
        if(index==digits.length()) {
            ans.add(curr);
            return;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String letters=map[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++) {
            find(digits,index+1,curr+letters.charAt(i),ans);
        }
    }
    public static void main(String[] args) {
        String digits="23";
        List<String> ans=new ArrayList<>();
        if(!digits.isEmpty()) find(digits,0,"",ans);
        System.out.println(ans);
    }
}