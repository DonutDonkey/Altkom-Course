package pl.accenture;

public class Car extends Vehicle {
    @Override
    void Base() { System.out.println("Car Base"); }

    public String GetCarName() { return "Is a car"; }
}
