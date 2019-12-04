package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[]{new Vehicle(), new Car(), new SportCar()};

        for(Vehicle veh : vehicles) {
            veh.go();
            if (veh instanceof SportCar) {
                ((Car)veh).horn();
                ((SportCar)veh).turbo();
            } else if (veh instanceof Car) {
                ((Car)veh).horn();
            }
        }

        Vehicle sportCar = new SportCar();
        SportCar sc = (SportCar)sportCar;

        sc.turbo();
        ((SportCar) sportCar).turbo();
    }
}
