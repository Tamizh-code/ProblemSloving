package week1.day2_6_1.homework;

import java.util.Scanner;

public class NearestPrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=2){
            System.out.println("prime number is 2");
            return;
        }
        if(checkPrime(n)){
            System.out.println("The number is already prime");
            return;
        }
        int dis=1;
        while(true){
            if(checkPrime(n+dis)){
                System.out.println("prime number is "+(n+dis));
                return;
            }
            if(checkPrime(n-dis)){
                System.out.println("prime number is " + (n-dis));
                return;
            }
            dis++;
        }

    }
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
