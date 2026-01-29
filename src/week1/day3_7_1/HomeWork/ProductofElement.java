package week1.day3_7_1.HomeWork;
import java.util.*;
public class ProductofElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] val={1,2,3,4};
        int [] res=new int[val.length];
//        for(int i=0;i<val.length;i++){
//            int mul=1;
//            for(int j=0;j<val.length;j++){
//                if(i!=j){
//                    mul*=val[j];
//                }
//            }
//            res[i]=mul;
//        }
//        System.out.println(Arrays.toString(res));
        int [] left=new int[val.length];
        int [] right=new int[val.length];
        int j=val.length-2;
        for(int i=0;i<val.length;i++){
            if(i==0 && j==val.length-2){
                left[i]=1;
                right[j+1]=1;
            }
            else{
                left[i]=left[i-1]*val[i-1];
                right[j]=right[j+1]*val[j+1];
                j--;
            }
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for(int i=0;i<val.length;i++){
            res[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
