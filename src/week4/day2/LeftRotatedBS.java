package week4.day2;

public class LeftRotatedBS {
    public static void main(String [] args){
//        int [] n={4,5,6,7,0,1,2};
        int [] n={1,3};
        int tar=0;
        System.out.print(binarySearch(n,0,n.length-1,tar));
    }
    public static int binarySearch(int []n,int st,int en,int tar){
        if(st>en)return -1;
        int mid=(st+en)/2;
        if(n[mid]==tar)return mid;
        if(n[st]<=n[mid]){
            if( n[st]<=tar && n[mid]>=tar) {
                return binarySearch(n, st, mid - 1, tar);
            }
            else {
                return binarySearch(n, mid+1, en, tar);
            }
        }
        else {
            if(n[mid]<=tar && n[en]>=tar){
            return binarySearch(n,mid+1,en,tar);
            }
            else {
                return binarySearch(n,st,mid-1,tar);
            }
        }
    }
}
