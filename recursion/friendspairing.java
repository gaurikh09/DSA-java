// Welcome to CodeCollab!
public class Main {
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=friendspairing(n-1);
        int fnm2=(n-1) * friendspairing(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(friendspairing(n));
    }
}
