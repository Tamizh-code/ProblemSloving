package Week6.day2;

public class TwoLargeNum {
    public static void main(String[] args) {
        int n=64998434;
        int max=0;
        int smax=0;
        while(n>0){
            if(max<n%10){
                smax=max;
                max=n%10;
            }
            if(max>n%10 && n%10>smax)smax=n%10;
            n/=10;
        }
        System.out.print((max*10)+smax);
    }
}
