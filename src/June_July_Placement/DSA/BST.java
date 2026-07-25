package June_July_Placement.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Node2{
    int key;
    Node2 left;
    Node2 right;
    Node2(int key){
        this.key=key;
        this.left=right=null;
    }
}
public class BST {
    static Node2 root;
    public BST(){
        root=null;
    }
    static void insert(int key){
        root=insertk(root,key);
    }
    static Node2 insertk(Node2 root,int key){
        if(root==null){
            root=new Node2(key);
            return root;
        }
        if(root.key > key){
           root.left=insertk(root.left,key);
        }
        else {
           root.right=insertk(root.right,key);

        }
        return root;
    }
    static void inorder() {
        inorderRec(root);
//        System.out.println("\n");
    }
    static void inorderRec(Node2 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        int n=12;
        int [] arr={30,20,10,25,28,27,5,4,3,35,40,50};
        arr=Sort.sort(arr,n);
        System.out.println(Arrays.toString(arr));
//        Scanner sc=new Scanner(System.in);
//        insert(30);
//        insert(20);
//        insert(10);
//        insert(25);
//        insert(28);
//        insert(27);
//        insert(5);
//        insert(4);
//        insert(3);
//        insert(35);
//        insert(40);
//        insert(50);
//        inorder();
    }
}
class Sort {
    static Node2 root;
    static ArrayList<Integer> al=new ArrayList<>();
        public Sort(){
        root=null;
    }
    static void insert(int key){
        root=insertk(root,key);
    }
    static Node2 insertk(Node2 root,int key){
        if(root==null){
            root=new Node2(key);
            return root;
        }
        if(root.key > key){
            root.left=insertk(root.left,key);
        }
        else {
            root.right=insertk(root.right,key);

        }
        return root;
    }
    static void inorder() {
        inorderRec(root);
//        System.out.println("\n");
    }
    static void inorderRec(Node2 root) {
        if (root != null) {
            inorderRec(root.left);
            al.add(root.key);
            inorderRec(root.right);
        }
    }

    static int[] sort(int [] arr,int n) {
        for(int i=0;i<n;i++){
            insert(arr[i]);
        }
        inorder();
        for(int i=0;i<n;i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}
