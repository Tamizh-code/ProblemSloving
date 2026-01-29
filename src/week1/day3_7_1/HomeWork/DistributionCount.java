package week1.day3_7_1.HomeWork;
import  java.util.Scanner;

public class DistributionCount {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int chi=sc.nextInt();
        int cho=sc.nextInt();
        int even=cho/chi;
        int odd=cho%chi;
        for(int i=0;i<chi;i++){
            if(odd!=0){
                System.out.println("child "+i+": "+(even+1));
                odd--;
            }
            else{
                System.out.println("child "+i+": "+even);
            }
        }
    }
}
