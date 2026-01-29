package Gendral;

import java.util.Arrays;
import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] s=sc.nextLine().split(",");
        int j=0;
        for(int i=0;i<s.length;i++){
            if(!s[i].equals("0")){
                s[j]=s[i];
                j++;
            }
        }
        while(j<s.length){
            s[j]="0";
            j++;
        }
        System.out.println(Arrays.toString(s));
    }
}
