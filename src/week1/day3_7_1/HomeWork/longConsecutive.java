package week1.day3_7_1.HomeWork;
import java.util.*;
public class longConsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] s=sc.nextLine().split(",");
        int [] val=new int[s.length];
        for (int i=0;i<s.length;i++)val[i]=Integer.parseInt(s[i]);
        Arrays.sort(val);
        int max=0;
        int c=1;
        for(int i=0;i<val.length-1;i++){
            if(val[i]+1==val[i+1]){
                c++;
                if(i==val.length-2 && max<c)max=c;
            }
            else{
                if(max<c){
                    max=c;
                }
//                max=Math.max(max,c);
                c=1;
            }
        }
        System.out.println(max);
    }
}
