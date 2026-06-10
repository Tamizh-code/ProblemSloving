package week3.day1_19_1;
import java.util.regex.*;
public class regex {
    public static void main(String[] args) {
//        String s="0879287390";
        String s="@Tamizh777@";
//        String s="tamizh@gmail.com";
//        String s="Tamizhmani V";
//        String s="637545445";
//        Pattern p=Pattern.compile("^[a-zA-Z]+[0-9]+$");
//        Pattern p=Pattern.compile("\\S");
//        Pattern p=Pattern.compile("^[986][0-9]{9}$");
//        Pattern p=Pattern.compile("[A-Z]+[a-z]+[0-9]+\\W+");
//        Pattern p=Pattern.compile("^[a-z0-9]+(?=@gmail.com)$");
//        Pattern p=Pattern.compile("^[A-Za-z ]+$");
//        Pattern p=Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Pattern p=Pattern.compile("^((?=.*[A-Z])+(?=.*[a-z])+(?=.*\\d)+(?=.*[@$!%*?&])+){8,}$");

        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println("Strong pass");
        }
//        System.out.println(m.matches());
//        System.out.println(m.find());
//        System.out.println(m.group());

    }
}
