package week1.day4_8_1.homeWork;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().replace(" ", "");
        String s2=sc.nextLine().replace(" ", "");
        if(s1.length()!=s2.length()){
            System.out.print("is not a anagram");
            return;
        }
        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            System.out.print("is anagram");
        }
        else{
            System.out.print("is not anagram");
        }

    }
}
