package week3.day1_20_1;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,2,3,3,3,3,4,4,4,5};
        int tar=3;
//        System.out.println(binaryleast(0,arr.length-1,arr,tar,-1));
//        System.out.println(binarylast(0,arr.length-1,arr,tar,-1));
        System.out.print(Arrays.binarySearch(arr,tar));
    }
//    public static int binaryleast(int left,int right,int[] arr,int tar,int res){
//        int mid=(left+right)/2;
//        if(arr[mid]==tar){
//            res=mid;
//            if(left<right)return binaryleast(left,mid-1,arr,tar,res);
//        }
//        if(arr[mid]>tar){
//            return binaryleast(left,mid-1,arr,tar,res);
//        }
//        if(arr[mid]<tar){
//            return binaryleast(mid+1,right,arr,tar,res);
//        }
//       return res;
//    }
//    public static int binarylast(int left,int right,int[] arr,int tar,int res){
//        int mid=(left+right)/2;
//        if(arr[mid]==tar){
//            res=mid;
//            if(left<right)return binarylast(mid+1,right,arr,tar,res);
//        }
//        if(arr[mid]>tar){
//            return binarylast(left,mid-1,arr,tar,res);
//        }
//        if(arr[mid]<tar){
//            return binarylast(mid+1,right,arr,tar,res);
//        }
//       return res;
//    }
}
