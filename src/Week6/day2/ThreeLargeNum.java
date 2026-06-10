package Week6.day2;

public class ThreeLargeNum {
    public static void main(String[] args) {
        int n=64998434;
        int max=0;
        int smax=0;
        int tmax=0;
        while(n>0){
            if(max<n%10){
                tmax=smax;
                smax=max;
                max=n%10;
            }
            if(max>n%10 && n%10>smax){
                tmax=smax;
                smax=n%10;
            }
            if(max>n%10 && smax>n%10 && n%10>tmax)tmax=n%10;
            n/=10;
        }
        System.out.print((((max*10)+smax)*10)+tmax);
    }
}
