package pl.accenture;

public class Truck extends Car {
    @Override
    void Base() { System.out.println("Truck Base"); }

    @Override
    public String GetCarName() { return "Is a truck"; }

    public String GetFuel() { return "Truck fuel"; }
}
