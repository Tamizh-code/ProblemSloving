package week1.day6_10_1.homework;

import java.util.Arrays;
import java.util.Scanner;

public class distinctInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] m={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(Arrays.deepToString(matrixReshape(m,2,8)));
//        int [] n={1,2,2,2,3,3,3,4,4,5,5,5};
//        int i=0,j=1;
//        while(i<n.length-1){
//            if(n[i]==n[i+1]){
//                i++;
//            }
//            else{
//                n[j]=n[i+1];
//                i++;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(n));
    }
        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            int [][] res=new int[r][c];
            int [] n=new int[mat.length*mat[0].length];
            int k=0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    n[k]=mat[i][j];
                    k++;
                }
            }
            System.out.println(Arrays.toString(n));
            k=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    res[i][j]=n[k];
                    k++;
                }
            }
            return res;
        }
}
