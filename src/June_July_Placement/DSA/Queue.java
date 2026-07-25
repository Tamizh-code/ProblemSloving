package June_July_Placement.DSA;

import java.util.Scanner;

public class Queue {
    static int n;
    static int s=-1;
    static int val[];
    public static void enque(int data){
        if(s+1>=n){
            System.out.println("QUEUE IS FULL !!");
            return;
        }
        val[s+1]=data;
    }
    public static void deque(){
        if(s==-1){
            System.out.println("Queue Empty!");
            return;
        }
        for(int i=1;i<s;i++){
            val[i-1]=val[i];
        }
    }
    public static void display(){
        if(s==-1){
            System.out.println("Queue Empty!");
            return;
        }
        for(int i=0;i<s;i++)System.out.println(val[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n=sc.nextInt();
        val=new int[n];
        System.out.println(val.length);
        while(true){
            System.out.println("1.enque\n2.deque\n3.display\n4.exit\n");
            int c=sc.nextInt();
            switch (c){
                case 1:{
                    int data=sc.nextInt();
                    enque(data);
                    s++;
                    break;
                }
                case 2:{
                    deque();
                    s--;
                    break;
                }
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
