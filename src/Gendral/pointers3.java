package Gendral;

import java.util.Arrays;
import java.util.Scanner;

public class pointers3 {
    public static void main(String [] args){
//        Scanner sc=new Scanner(System.in);
//        String [] str=sc.nextLine().split(",");
        int [] val={1,0,2,1,0,1,2};
//        for(int i=0;i<str.length;i++)val[i]=Integer.parseInt(str[i]);
        int i=0,j=0,k=val.length-1;
        while(j<val.length && j<=k){
            if(val[j]==0){
                int temp=val[j];
                val[j]=val[i];
                val[i]=temp;
                i++;

            }
            else if(val[j]==2){
                int temp=val[j];
                val[j]=val[k];
                val[k]=temp;
                k--;
            }
            else {
                j++;
            }
        }
        System.out.print(Arrays.toString(val));
    }
}
