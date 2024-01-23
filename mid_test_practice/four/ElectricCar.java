package four;

public class ElectricCar extends Vehicle{
    public final static double MAX_DISTANCE = 500.0;
    protected double chargeLevel;
    ElectricCar(double chargeLevel){
        this.chargeLevel = chargeLevel;
    }
}
