package week1.day2_6_1.homework;

import java.util.Scanner;

public class DiagonalMatrixsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [][] max={{1,2,3},{4,5,6},{7,8,9}};
//        if(max.length != max[0].length){
//            System.out.println("Error");
//        }
        int ld=0,rd=0;
        for(int i=0;i<max.length;i++){
            for(int j=0;j<max[i].length;j++){
                if(i==j){
                    ld+=max[i][j];
                }
                if(j==max.length-1-i){
                    rd+=max[i][j];
                }
            }
        }
        System.out.println("The diagonal Sum of matrix is:"+ld+" "+rd);
    }
}
