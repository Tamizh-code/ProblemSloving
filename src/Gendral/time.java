package Gendral;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] from=sc.nextLine().split("-");
        String [] to=sc.nextLine().split("-");
        LocalDate start = LocalDate.of(Integer.parseInt(from[2]), Integer.parseInt(from[1]), Integer.parseInt(from[0]));
        LocalDate end   = LocalDate.of(Integer.parseInt(to[2]),Integer.parseInt(to[1]),Integer.parseInt(to[0]));

        Period p = Period.between(start, end);

        System.out.print(p.getDays() + " days ");
        System.out.print(p.getMonths() + " months ");
        System.out.print(p.getYears() + " years ");

    }
}
