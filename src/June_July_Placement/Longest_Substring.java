package June_July_Placement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_Substring {
//    static int max=0;
    public static void main(String[] args) {
        String s="aabaacb";
        int k=2;
//        String [] arr=s.split("[a,b]");
        System.out.println(longestSubstring(s,k));
    }
    static int max=0;
        public static  int longestSubstring(String s, int k) {
            Map<Character,Integer> mp=new HashMap<>();
            for(char c:s.toCharArray()){
                mp.put(c,mp.getOrDefault(c,0)+1);
            }
            char cc='1';
            for(Map.Entry<Character,Integer> en:mp.entrySet()){
                if(en.getValue()>k){
                    cc=en.getKey();
                }
            }
            if(cc=='1')return s.length();
            String [] ss=s.split(Character.toString(cc));
            for(String st:ss)max=Math.max(max,longestSubstring(st,k));
            return max;
        }
}
