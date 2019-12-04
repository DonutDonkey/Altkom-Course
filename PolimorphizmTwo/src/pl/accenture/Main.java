package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{new Vehicle(), new Car(), new SportCar()};
        Vehicle[] var2 = vehicles;
        int var3 = vehicles.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Vehicle veh = var2[var4];
            veh.go();
            if (veh instanceof Car) {
                ((Car)veh).horn();
            } else if (veh instanceof SportCar) {
                ((Car)veh).horn();
                ((SportCar)veh).turbo();
            }
        }

        Vehicle sportCar = new SportCar();
        SportCar sc = (SportCar)sportCar;

        sc.turbo();
        ((SportCar) sportCar).turbo();
    }
}
