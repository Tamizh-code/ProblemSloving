package week1.day2_6_1;

public class twoSum {
    public static void main(String[] args) {
        int[] n={2,7,11,15};
        int i=0,j=0,tar=9;
        while(i<n.length){
            j=i+1;
            while(j<n.length){
                if(n[i]+n[j]==tar){
                    System.out.println("index: "+i+" "+j);
                    return;
                }
                j++;
            }
            i++;
        }
    }
}
