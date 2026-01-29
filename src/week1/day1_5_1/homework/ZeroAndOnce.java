package week1.day1_5_1.homework;
import java.util.*;
public class ZeroAndOnce  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] n={1,0,4,0,0,5,6,0,0,2};
        int[] n={0,0,1,0,0,1,1};
        int j=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                int t=n[i];
                n[i]=n[j];
                n[j]=t;
                j++;
            }
        }
        System.out.println(Arrays.toString(n));
        sc.close();
    }
}
