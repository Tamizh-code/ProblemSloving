package Gendral;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t-->0){
            int n=5;
//            sc.nextLine();
            String s="aaabc";
            String ss=s;
            boolean b=true;
            for(int i=1;i<n-1;i++){
                if(palin(s)){
                    b=false;
                    System.out.println("yes");
                    break;
                }
                else{
                    s=ss.substring(0,i-1)+ss.substring(i+2);
                }

            }
            if(b)System.out.println("NO");
        }
    }
    public static boolean palin(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString())?true:false;
    }
}
