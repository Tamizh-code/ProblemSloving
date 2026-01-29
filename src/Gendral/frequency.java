package Gendral;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String [] s=sc.nextLine().split(",");
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length;i++)mp.put(s[i],mp.getOrDefault(s[i],0)+1);
        System.out.println(mp);
        int max=0;
        for(Map.Entry<String,Integer> e:mp.entrySet())if(e.getValue()>max)max=e.getValue();
        for(Map.Entry<String,Integer> e:mp.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey());
                 return;
            }
        }
    }
}
