package week1.day2_6_1.homework;

import java.util.Scanner;

public class coinCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins={1,2,5,10};
        int n=sc.nextInt();
        int count=0;
        int i=coins.length-1;
        while(n>0){
            count+=n/coins[i];
            n%=coins[i];
            i--;
        }
        System.out.print(count);
    }
}
