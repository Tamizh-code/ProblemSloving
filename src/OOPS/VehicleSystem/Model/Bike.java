package VehicleSystem.Model;

public class Bike extends Vehicle {

    private String bikeType;

    public Bike(int id, String brand, double price, String bikeType) {
        super(id, brand, price);
        this.bikeType = bikeType;
    }

    @Override
    public String getType() {
        return "Bike";
    }

    @Override
    public String getExtra() {
        return bikeType;
    }

    @Override
    public void show() {

        System.out.println("Bike | " + getId() +
                " | " + getBrand() +
                " | " + getPrice() +
                " | Type: " + bikeType);
    }
}
