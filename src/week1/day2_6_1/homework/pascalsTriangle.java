package week1.day2_6_1.homework;

import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] max=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0||j==0){
                    max[i][j]=1;
                }
                else if(i==j){
                    max[i][j]=1;
                }
                else{
                    max[i][j]=max[i-1][j-1]+max[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(max[i][j]+" ");
            }
            System.out.println();
        }
    }
}
