package June_July_Placement;

import java.util.Scanner;

public class Knapsack_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] w={1,3,4,5};
        int [] v={1,4,5,7};
        int c=7;
        int [] [] dp=new int[w.length+1][c+1];
        for (int i=1;i<w.length+1;i++){
            for(int j=1;j<c+1;j++){
                if(w[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for (int i=0;i<w.length+1;i++){
            for(int j=0;j<c+1;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
    }
}
