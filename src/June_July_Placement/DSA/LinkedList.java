package June_July_Placement.DSA;
import java.util.*;

//class Node{
//    int data;
//    Node left,right;
//    Node(int data){
//        this.data=data;
//        this.left=right=null;
//    }
//}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListClass {
    int size=0;
    Node head=null,tail=null,curr=null,temp=null;
    public void insertAtBeg(int data){
        Node nn=new Node(data);
        if(head ==null){
            head=tail=curr=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void insertAtEnd(int data){
        Node nn=new Node(data);
        if(head==null){
            head=tail=curr=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void insertAtPos(int data,int pos){
        Node nn=new Node(data);
        if(size<pos) {
            System.out.println("your given position is more then LinkedList size");
            return;
        }
        int s=0;
        curr=head;
        while(s<=pos){
           temp=curr.next;
           curr=temp;
           s++;
        }
        temp=curr.next;
        curr.next=nn;
        nn.next=temp;
    }
    public void display(){
        if(head==null){
            System.out.println("THE NODE HAS NOTHING TO SHOW ");
            return;
        }
        int i=0;
        tail=head;
        while(i<=size){
//        while(tail.next==null){
            System.out.print(tail.data+" ");
            temp=tail.next;
            tail=temp;
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListClass ll=new LinkedListClass();
        while(true) {
            System.out.println("1.display \n2.InsertAtBeg\n3.insertAtEnd\n4.insertAtPos\n5.exit");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    ll.display();
                    break;
                case 2:{
                    int data=sc.nextInt();
                    ll.insertAtBeg(data);
                    break;}
                case 3:{
                    int data=sc.nextInt();
                    ll.insertAtEnd(data);
                    break;}
                case 4:{
                    int data=sc.nextInt();
                    int pos=sc.nextInt();
                    ll.insertAtPos(data,pos);
                    break;}
                case 5:
                    System.exit(0);
            }
        }
    }
}
