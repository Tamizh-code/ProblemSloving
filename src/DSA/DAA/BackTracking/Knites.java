package DAA.BackTracking;

public class Knites {
    public static int min=Integer.MAX_VALUE;
    public static int a=0;
    public static int b=0;
    public static int c=7;
    public static int d=7;
    public static int n=8;
    public static void main(String [] args){
        int [][] sol=new int[n][n];
        find(a,b,sol,0);
        System.out.print(min);
    }
    public static boolean find(int i,int j,int [][] sol ,int co){
        if(i==c&&j==d){
            if(min>co)min=co;
            return false;
        }
        if(i<0||i>=n||j<0||j>=n||sol[i][j]==1)return false;
        if(co>=min)return false;
        sol[i][j]=1;
        if(find(i+2,j+1,sol,co+1))return true;
        if(find(i+2,j-1,sol,co+1))return true;
        if(find(i-2,j+1,sol,co+1))return true;
        if(find(i-2,j-1,sol,co+1))return true;
        if(find(i+1,j+2,sol,co+1))return true;
        if(find(i+1,j-2,sol,co+1))return true;
        if(find(i-1,j+2,sol,co+1))return true;
        if(find(i-1,j-2,sol,co+1))return true;
        sol[i][j]=0;
        return false;
    }
}
