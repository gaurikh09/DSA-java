public class Main {
    public static void findSubsets(String str, String ans, int index) {
        System.out.println(ans);
        for (int i = index;i<str.length();i++) {
            findSubsets(str,ans+str.charAt(i),i+1);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,"",0);
    }
}