package VehicleSystem.main;

import VehicleSystem.Service.VehicleService;

import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VehicleService service = new VehicleService();

        while(true){

            System.out.println("\n1.Add Car");
            System.out.println("2.Add Bike");
            System.out.println("3.View");
            System.out.println("4.Exit");

            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    service.addCar(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.nextInt());
                    break;

                case 2:
                    service.addBike(
                            sc.nextInt(),
                            sc.next(),
                            sc.nextDouble(),
                            sc.next());
                    break;

                case 3:
                    service.view();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
