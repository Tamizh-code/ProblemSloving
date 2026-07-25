package June_July_Placement.DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StackAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        while(true){
            System.out.println("1.push\n2.pop\n3.display\n4.exit\n");
            int c=sc.nextInt();
            switch (c){
                case 1:{
                    int data=sc.nextInt();
                    al.add(data);
                    break;
                }
                case 2:{
                    al.remove(al.size()-1);
                    break;
                }
                case 3:
                    System.out.println(al);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
