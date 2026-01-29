package week1.day2_6_1.homework;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int h=i;
            for(int j=1;j<=i;j++){
                System.out.print(h+" ");
                h+=2;
            }
            System.out.println();
        }
    }
}
