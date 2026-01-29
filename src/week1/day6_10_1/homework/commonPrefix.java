package week1.day6_10_1.homework;
import java.util.*;
public class commonPrefix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//         String []s={"flower","flag","flight"};
        String []s={"lord","dad","bad"};
        String tar=s[0];
        for(int i=1;i<s.length;i++){
            if(tar.length()>s[i].length()){
                tar=s[i];
            }
        }
        for(int i=0;i<tar.length();i++){
            for(int j=0;j<s.length;j++){
                if(tar.charAt(i)!=s[j].charAt(i)){
                    if(i!=0)System.out.print(tar.substring(0,i));
                    else System.out.println(-1);
                    return;

                }
            }
        }
        System.out.println(tar);
//        System.out.print(Arrays.binarySearch(s,"dad"));
    }
}
