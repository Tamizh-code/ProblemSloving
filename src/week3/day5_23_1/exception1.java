package week3.day5_23_1;

import java.util.*;

public class exception1 {
    public static void main(String [] args) throws NumberExep{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b==0){
            throw new NumberExep("cant div by 0");
        }else{
            System.out.println(a/b);
        }
//        try{
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
    static class NumberExep extends Exception{
//        String s;
        NumberExep(String s){
//            this.s=s;
            super(s);
        }
    }
}

