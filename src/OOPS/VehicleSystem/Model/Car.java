package VehicleSystem.Model;


public class Car extends Vehicle {

    private int seats;

    public Car(int id, String brand, double price, int seats) {
        super(id, brand, price);
        this.seats = seats;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public String getExtra() {
        return String.valueOf(seats);
    }

    @Override
    public void show() {

        System.out.println("Car | " + getId() +
                " | " + getBrand() +
                " | " + getPrice() +
                " | Seats: " + seats);
    }
}
