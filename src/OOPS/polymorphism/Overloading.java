package polymorphism;

public class Overloading {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.print(a.calculate(1));
    }
}
class Area{
    double calculate(double r){
        System.out.println("triangle area");
        return 3.14*r*r;
    }int calculate(int l){
        System.out.println("Sqr area");
        return l*l;
    }int calculate(int l,int h){
        System.out.println("rec area");
        return l*h;
    }double  calculate(double b,double h){
        System.out.println("tri area");
        return 1.5*b*h;
    }
}
