package week1.day4_8_1.homeWork;
import java.util.*;

public class findLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        while(!s.equals("")){
            s=s.substring(1);
            i++;
        }
        System.out.println(i);
    }
}
