package week1.day1_5_1.homework;
import java.util.*;
public class pointer3 {
    public static void main(String[] args) {
        int [] n={1,2,0,2,1,0,2,1};
        int j=0,k=n.length-1,i=0;
        while(i<n.length && i<=k){
            if(n[i]==0){
                int t=n[i];
                n[i]=n[j];
                n[j]=t;
                j++;
            } else if (n[i]==2) {
                int te=n[i];
                n[i]=n[k];
                n[k]=te;
                k--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
