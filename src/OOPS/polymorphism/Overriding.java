package polymorphism;

public class Overriding {
    public static void main(String[] args) {
        B a=new B();
        a.display();
    }
}
class A{
     void display(){
        System.out.println("displayA");
    }
}
class B extends A{
    void display(){
        System.out.println("displayB");
    }
}
