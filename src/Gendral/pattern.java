package Gendral;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int odd=1,even=2;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                for(int j=0;j<i;j++){
                    System.out.print(even+" ");
                    even+=2;
                }
            }
            else {
                for(int j=0;j<i;j++){
                    System.out.print(odd+" ");
                    odd+=2;
                }
            }
            System.out.println();
        }
    }
}
