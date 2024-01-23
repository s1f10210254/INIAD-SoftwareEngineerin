package four;

public class Vehicle {
    public final static double  EFFICIENCY = 22.5;
    protected final String manufacturer;
    double fuel;

    public Vehicle(String manufacturer, double fuel){
        this.manufacturer = manufacturer;
        this.fuel = fuel;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getDistance(){
        return EFFICIENCY * fuel;
    }
}
