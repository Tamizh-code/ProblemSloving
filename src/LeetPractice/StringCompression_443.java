package LeetPractice;
import java.util.*;
public class StringCompression_443 {
    static char n[]={'a','a','a','b','b','a','a'};
    static int k=0;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(n,0,str(n))));
    }
    public static int str(char[] c){
        int i=0,j=0,x=0;
        while(j<c.length+1){
            if(j!=c.length+1 && c[i]==c[j]){
                x+=1;
                j++;
            }
            else{
                n[k]=n[i];
                k++;
                char [] cc=Integer.toString(x).toCharArray();
                for(char cn:cc){
                    n[k++]=cn;
                }
                i=j;
                x=0;
            }
        }
        return i;
    }
}
