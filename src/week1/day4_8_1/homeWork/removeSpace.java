package week1.day4_8_1.homeWork;
import java.util.*;
public class removeSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print(sc.nextLine().replace(" ",""));
        String res="";
        String [] s=sc.nextLine().split(" ");
        for(String str:s){
            res+=str;
        }
        System.out.println(res);
    }
}
