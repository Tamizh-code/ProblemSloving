package week1.day4_8_1.homeWork;
import java.util.*;
public class elabfrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        String s=sc.nextLine();
        String []n2=s.split("\\D");
        String []n1=s.split("\\d");
        int k=0;
        for(int i=0;i<n1.length;i++){
            if(!n1[i].trim().equals("")){
                String tem=n1[i].trim();
                n1[i]=n1[k].trim();
                n1[k]=tem;
                k++;
            }
        }
        k=0;
        for(int i=0;i<n2.length;i++){
            if(!n2[i].trim().equals("")){
                String tem=n2[i].trim();
                n2[i]=n2[k].trim();
                n2[k]=tem;
                k++;
            }
        }
        System.out.println(Arrays.toString(n2));
        System.out.println(Arrays.toString(n1));

       String ss="";
        for(int j=0;j<n1.length;j++){
            int n=Integer.parseInt(n2[j].trim());
            for(int i=0;i<n;i++){
                ss+=n1[j].trim();
            }
        }
        System.out.println(ss);
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ss.length();i++){
            char c=ss.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }

        long endTime = System.currentTimeMillis(); // end time

        long executionTime = (endTime - startTime)/1000;

        System.out.println("Execution Time: " + executionTime + " ms");
    }
}
