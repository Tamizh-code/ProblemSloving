package week1.day3_7_1.HomeWork;
import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String alb="abcefghijklmnopqrtuvwxyz";
        String sen=sc.nextLine().toLowerCase().trim();
        for(int j=0;j<alb.length();j++){
            char a=alb.charAt(j);
            if(sen.indexOf(a)==-1){
                System.out.println("This doesn't a Pangram");
                return;
            }
        }
        System.out.println("This is a Pangram");
    }
}
