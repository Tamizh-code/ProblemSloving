package VehicleSystem.Model;
public abstract class Vehicle {

    private int id;
    private String brand;
    private double price;

    public Vehicle(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    // Encapsulation
    public int getId() { return id; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }

    // Abstraction
    public abstract String getType();
    public abstract String getExtra();

    public abstract void show();
}
