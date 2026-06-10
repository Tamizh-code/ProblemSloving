package June_July_Placement;

import java.util.Arrays;

public class Minimum_Coins {
    public static void main(String[] args) {
        int n=6;
        int [] c={1,3,4};
        int [] dp=new int[n+1];
        int cc=0;
        for(int i=1;i<n+1;i++)dp[i]=Integer.MAX_VALUE;
        for(int i=0;i<c.length;i++){
            int x=c[i];
            for(int j=c[i];j<n+1;j++){
//                if(j>=c[i])dp[j]=Math.min(dp[j],1+dp[j - c[i]]);
//                if(x+(dp[j]*c[i])==n)cc++;

                dp[j]=Math.min(dp[j],1+dp[j - c[i]]);
            }

        }
        System.out.print(Arrays.toString(dp) + cc);

    }
}
