package week3.day3_21_1;

public class BinaryMatrix {
    public static void main(String [] args){
        int [][] max={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,14,16}};
        int m=max.length;
        int  n=max[0].length;
        int tar=15;
        for(int i=0;i<m;i++){
            if(max[i][n-1]<tar)continue;
            if(max[i][n-1]==tar){
                System.out.println("target found at"+i+" "+(n-1));
                return;
            }
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(max[i][mid]==tar){
                    System.out.println("target found at "+(i+1)+" "+(mid+1));
                    return;
                }
                if(max[i][mid]<tar)low=mid+1;
                if(max[i][mid]>tar)high=mid-1;
            }
            System.out.println("there is no such element");
        }
    }
}
