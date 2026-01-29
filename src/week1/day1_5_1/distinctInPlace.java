package week1.day1_5_1;
import java.util.*;
public class distinctInPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] n={1,2,2,2,3,3,3,4,4,5,5,5};
        int i=0,j=1;
        while(i<n.length-1){
            if(n[i]==n[i+1]){
                i++;
            }
            else{
                n[j]=n[i+1];
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
