package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Vehicle [] vehicles = {new Vehicle(), new Ship(), new Plane(), new Car(), new Truck(), new RaceCar()};

        for (Vehicle ve: vehicles ) {
            System.out.println("##############");

            if(ve instanceof RaceCar) {
                ve.Base();
                System.out.println(((RaceCar) ve).GetCarName() + System.lineSeparator() + ((RaceCar) ve).GetTurbo());
            } else if (ve instanceof Truck) {
                ve.Base();
                System.out.println(((Truck) ve).GetCarName() + System.lineSeparator() + ((Truck) ve).GetFuel());
            } else if (ve instanceof Car) {
                ve.Base();
                System.out.println(((Car) ve).GetCarName());
            } else if (ve instanceof Plane) {
                ve.Base();
                System.out.println(((Plane) ve).GetPlaneName());
            } else if (ve instanceof Ship) {
                ve.Base();
                System.out.println(((Ship) ve).GetShipName());
            } else {
                ve.Base();
            }
        }

    }
}
