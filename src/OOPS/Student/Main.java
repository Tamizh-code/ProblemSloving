package Student;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Controller c=new Controller();
        String name=c.name(sc.nextLine());
        int age=sc.nextInt();
        sc.nextLine();
        String height=sc.nextLine();
        String email=c.email(sc.nextLine());
        String phone=c.phone(sc.nextLine());
        Student s=Student.newStudent(name,age,height,email,phone);
        System.out.println(s);
    }
}
