// Welcome to CodeCollab!
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m<n){
            return minDistance(word2,word1);
        }
        if(m<n){
            return minDistance(word2,word1);
        }
        int[] prev = new int[n+1];
        int[] curr = new int[n+1];
        for(int j=0;j<=n;j++){
            prev[j] = j;
        }
        for(int i =1;i<=m;i++){
            curr[0] = i;
            for(int j = 1; j<=n;j++){
            if(word1.charAt(i-1) == word2.charAt(j-1)){
                curr[j] = prev[j-1];
            }else{
                int replaceOp=prev[j-1];
                int insertOp = curr[j-1];
                int deleteOp=prev[j];
                curr[j]= 1+Math.min(replaceOp,Math.min(insertOp,deleteOp));
            }
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[n];

    }
}
