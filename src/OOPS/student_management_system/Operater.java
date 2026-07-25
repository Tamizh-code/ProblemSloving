package student_management_system;

import student_management_system.logic.range;


import java.util.ArrayList;
import java.util.Scanner;

public class Operater {
    private static Scanner sc=new Scanner(System.in);
    private static  int id=0;
    private static Students s;
    private static range r;
    private static ArrayList<Students> all=new ArrayList<>();
    // view data of all
    public static void viewAll(){
        if(!all.isEmpty()){
            System.out.println("*****All Details Are Here*****");
            for(Students s:all){
                System.out.println(s);
            }
        }
        else{
            System.out.print("*****No Record has Founded In The Server*****");
        }
    }
    public static void partData(){
        System.out.println("------Enter Id to det your details------");
        while(true){
            int ida=sc.nextInt();
            if(all.get(all.size()-1).getId()<ida){
                System.out.println("******Please enter a valid Id*****");
                continue;
            }
            for(int i=0;i<all.size();i++){
                if(all.get(i).getId()==ida){
            int ch=choice();
            switch (ch){
                case 1 -> System.out.print(all.get(ida).getName());
                case 2 -> System.out.print(all.get(ida).getDept());
                case 3 -> System.out.print(all.get(ida).getEmail());
                case 4 -> System.out.print(all.get(ida).getYear());
                case 5 ->{
                    System.out.print("*****Thankyou*****");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
                }
            }
        }
    }
    //insert data;
    public static void insert(){
        System.out.println("*****Enter your details to add*****");
        System.out.println("-------Enter your Name----------");
        String name=sc.nextLine();
        System.out.println("-------Enter your Department----");
        String dept=sc.nextLine();
        System.out.println("-------Enter your Email---------");
        String email=sc.nextLine();
        System.out.println("-------Enter your year----------");
        int  year=sc.nextInt();
        System.out.println("-------!adding your details-----");
        s=Students.newStudent(id,name,dept,email,year);
        all.add(s);
    }
    //choice selection;
    public static int choice(){
        System.out.println("-----1.Name----------");
        System.out.println("-----2.Department----");
        System.out.println("-----3.Email---------");
        System.out.println("-----4.Year----------");
        System.out.println("-----5.Exit----------");
        int cho=sc.nextInt();
        return cho;
    }
    //update date
    public static void update(){
        while(true){
           int ida=sc.nextInt();
           if(all.get(all.size()-1).getId()<ida){
               System.out.println("******Please enter a valid Id*****");
               continue;
           }
            for(int i=0;i<all.size();i++){
                if(all.get(i).getId()==ida){

           int ch=choice();
           switch (ch){
               case 1:
                   System.out.println("old data: "+all.get(ida).getName()+"\nEnter your new name: ");
                   String  name=sc.nextLine();
                   all.get(ida).setName(name);
                   break;
               case 2:
                   System.out.println("old data: "+all.get(ida).getDept()+"\nEnter your new deptatment: ");
                   String  dept=sc.nextLine();
                   all.get(ida).setDept(dept);
                   break;
               case 3:
                   System.out.println("old data: "+all.get(ida).getEmail()+"\nEnter your new Email: ");
                   String  email=sc.nextLine();
                   all.get(ida).setEmail(email);
                   break;
               case 4:
                   System.out.println("old data: "+all.get(ida).getYear()+"\nEnter your new Year: ");
                   int  year=sc.nextInt();
                   all.get(ida).setYear(year);
                   break;
               case 5:
                   System.out.print("*****Thankyou for the Service*****");
                   return;
               default:
                   System.out.println("Invalid Choice");
                   break;
           }
                }
            }
        }
    }
    //delete method
    public static void delete(){
        System.out.println("Enter your id want to delete:");
        int ida=sc.nextInt();
        if(all.get(all.size()-1).getId()<ida){
            System.out.println("******Please enter a valid Id*****");
            return;
        }
        for(int i=0;i<all.size();i++){
            if(all.get(i).getId()==ida){

        all.remove(i);
        System.out.println("your data is sucessfully deleted");
            }
        }
    }
    //rangepeople
    public static void rangeList(){
        System.out.print("use cammas to seperate if range means -");

    }

}
