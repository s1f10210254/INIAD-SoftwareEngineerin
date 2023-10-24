public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car(4);
        Vehicle vehicle = new Vehicle();

        car.start();
        car.stop();
        vehicle.start();
        vehicle.stop();
    }
}
