package June_July_Placement.DSA;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StackArray {
    static Scanner sc=new Scanner(System.in);
    static int n;
    static int s=-1;
    static int [] val;
    public static void push(int data){
        val[s+1]=data;
    }
    public static void pop(){
        if(s==-1){
            System.out.println("StackEmpty!");
            return;
        }
        val[s]=0;
    }
    public static void display(){
        for(int v:val)if(v!=0)System.out.println(v);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array");
        n=sc.nextInt();
        val=new int[n];
        System.out.println(val.length);
        while(true){
            System.out.println("1.push\n2.pop\n3.display\n4.exit\n");
            int c=sc.nextInt();
            switch (c){
                case 1:{
                    int data=sc.nextInt();
                    push(data);
                    s++;
                    break;
                }
                case 2:{
                    pop();
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
