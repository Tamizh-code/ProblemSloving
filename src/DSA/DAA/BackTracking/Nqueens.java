package DAA.BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class Nqueens {
    public static int n;
    public static int [][]sol;
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sol=new int[n][n];
        if(find(0,0,sol,0)){
            System.out.print(Arrays.deepToString(sol));
        }
    }
    public static boolean find(int i,int j,int [][]sol,int c){
        if(c==n){
            return true;
        }
        if(i<0||i>=n||j<0||j>=n){
            return false;
        }
        if(!valid(sol,i,j)){
            if(find(i,j+1,sol,c))return true;
            
        }
        sol[i][j]=1;
        if(find(i+1,0,sol,c+1))return true;
        sol[i][j]=0;
        return false;
    }
    public static boolean valid(int[][]sol,int i,int j){
        //column
        for(int k=0;k<i;k++){
            if(sol[k][j]==1){
                return false;
            }
        }
        //l_dig
        int m=i,h=j;
        while(m>=0&&h>=0){
            if(sol[m--][h--]==1)return false;
        }
         m=i;
        h=j;
        while(m>=0&&h<n){
            if(sol[m--][h++]==1)return false;
        }
        return true;
    }
}
