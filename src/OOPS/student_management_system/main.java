package student_management_system;

import java.util.Scanner;

public class main {
         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
             Operater op=new Operater();
             while (true) {
                 System.out.print("*****User Service List*****");
                 System.out.print("-----1.View all Students List-----");
                 System.out.print("-----2.Get a Particular Data------");
                 System.out.print("-----3.Admit Of New Student-------");
                 System.out.print("-----4.Modify Students Details----");
                 System.out.print("-----5.Dismiss a Student----------");
                 System.out.print("-----6.Selected list of Students--");
                 System.out.print("-----7.Close The Document---------");
                 int scid = sc.nextInt();
                 switch (scid) {
                     case 1 -> op.viewAll();
                     case 2 -> op.partData();
                     case 3 -> op.insert();
                     case 4 -> op.update();
                     case 5 -> op.delete();
                     case 6 -> op.rangeList();
                     case 7:
                         System.out.print("*****Thankyou For Using Our Systems*****");
                         return;
                     default -> System.out.print("!!!!Pick The Correct Option");
                 }
             }
         }
}
