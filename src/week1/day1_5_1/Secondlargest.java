package week1.day1_5_1;
import java.util.Scanner;
public class Secondlargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] n={68,36,2,5,23,35,65,65,28,};
        int max=n[0];
        int secmax=0;
        for(int i=1;i<n.length;i++){
            if(n[i]>max){
                max=n[i];
            }
            if(max>n[i]){
                if(n[i]>secmax){
                    secmax=n[i];
                }
            }
        }
        System.out.println(secmax);
    }
}
