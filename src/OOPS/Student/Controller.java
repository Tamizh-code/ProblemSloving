package Student;
import java.util.regex.*;
import java.util.*;
public class Controller {
     protected static Scanner  sc=new Scanner(System.in);
     //name
    public static String name(String s){
        Pattern p=Pattern.compile("^[A-Za-z ]+$");
        Matcher m=p.matcher(s);
        if(!m.matches()) {
            System.out.println("Invalid name\nplease try again:");
            String ss=sc.nextLine();
            return name(ss);
        }
        return s;
    }
    //Email
    public static String email(String s){
        Pattern p = Pattern.compile("^[a-zA-Z0-9._%+-]+(?=@gmail\\.com)");
        Matcher m=p.matcher(s);
        if(!m.matches()) {
            System.out.println("Invalid Email\nplease try again:");
            return email(sc.nextLine());
        }
        return s;
    //phone
    }public static String phone(String s){
        Pattern p=Pattern.compile("^[986][0-9]{9}$");
        Matcher m=p.matcher(s);
        if(!m.matches()) {
            System.out.println("Invalid phonenumber\nplease try again:");
            return phone(sc.nextLine());
        }
        return s;
    }
}
