package June_July_Placement.DSA;
import java.util.*;
class Stack_LLOP {
    Node head=null,tail=null,curr=null,temp=null;
    void push(int data){
        Node nn=new Node(data);
        if(head==null){
            head=tail=curr=nn;
        }
        else{
            curr.next=nn;
            curr=nn;
        }
    }
    void pop(){
        if(head==null){
            System.out.println("Stack Empty!");
            return;
        }
        System.out.println(curr.data);
        if(head.next==null){
            head=null;
        }
        tail=head;
        while(tail.next.next!=null){
            tail=tail.next;
        }
        tail.next=null;
        System.out.println("deleted Sucessfull");
    }
    public void display() {
        if (head == null) {
            System.out.println("THE NODE HAS NOTHIN TO SHOW ");
            return;
        }
        int i = 0;
        tail = head;
//        while (i <= size) {
        while(tail!=null){
            System.out.println(tail.data + " ");
            tail = tail.next;
//            tail = temp;
        }
    }
}
public class Stack_LL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack_LLOP ss=new Stack_LLOP();
        while(true){
            System.out.println("1.push\n2.pop\n3.display\n4.exit\n");
            int c=sc.nextInt();
            switch (c){
                case 1:{
                    int data=sc.nextInt();
                    ss.push(data);
                    break;
                }
                case 2:{
                    ss.pop();
                    break;
                }
                case 3:
                    ss.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
