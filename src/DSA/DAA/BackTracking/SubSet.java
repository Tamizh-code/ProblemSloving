package DAA.BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSet {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] val=new int[n];
        for(int i=0;i<n;i++)val[i]=sc.nextInt();
        find(0,val,new ArrayList<>());
    }
    public static void find(int i,int [] val,ArrayList<Integer> l){
        if(i==val.length){
            System.out.println(l);
            return;
    }
        find(i+1,val,l);
        l.add(val[i]);
        find(i+1,val,l);
//        return;
        l.remove(l.size()-1);
    }
}
