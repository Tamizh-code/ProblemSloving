package Gendral;

import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
//        int [][] max=new int[n*2-1][n*2-1];
        int size=n*2-1;
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                int d=Math.min(Math.min(i,j),Math.min(size-i-1,size-j-1));
                System.out.print(n-d+" ");
            }
            System.out.println();
        }
    }
}
