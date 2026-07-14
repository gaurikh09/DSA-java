public class sumevenodd {
    public static void main(String[] args){
        int n=50;
        int sumodd=0;
        int sumev=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sumev+=i;
            }
            else{
                sumodd+=i;
            }
        }
        System.out.println(sumodd);
        System.out.print(sumev);

    }
}
