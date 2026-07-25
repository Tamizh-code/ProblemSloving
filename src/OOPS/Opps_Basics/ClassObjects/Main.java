package Opps_Basics.ClassObjects;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("Rahul","Sft Dev",25000.00);
        Employee e2=new Employee("Gokul","Sft Dev",27000.00);
        System.out.println(e1);
        System.out.println(e2);
    }
}
class car{
    double price;
    String Brand;
}
class Student{
    int Rollno;
    String Name;
    int Mark;
}
class Book{
    void displayDetails(){
        System.out.println("All Details");
    }
    void UpdatePrice(){
        System.out.println("Updated sucessful");
    }
}
class Employee{
    String Name;
    String Designation;
    double Salary;
    public Employee(String Name,String designation,double salary){
        this.Name=Name;
        this.Designation=designation;
        this.Salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Designation='" + Designation + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}