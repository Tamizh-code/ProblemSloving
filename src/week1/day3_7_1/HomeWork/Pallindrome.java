package week1.day3_7_1.HomeWork;
import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            System.out.println("is a Pallindrome");
        }
        else {
            System.out.println("is not a Pallindrome");
        }

    }
}
