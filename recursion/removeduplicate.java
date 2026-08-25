// Welcome to CodeCollab!
public class Main {
    public static void removedupli(String str, int idx, StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a'] == true){
            removedupli(str,idx+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            removedupli(str,idx+1,newstr.append(currchar),map);
        }
    }
    public static void main(String[] args) {
        String str="aapnaaacolleege";
        removedupli(str,0, new StringBuilder(""),new boolean[26]);
    }
}
