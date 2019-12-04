package pl.accenture;

public class RaceCar extends Car {
    @Override
    void Base() { System.out.println("Car Base"); }

    @Override
    public String GetCarName() { return "Is a RaceCar"; }

    public String GetTurbo() { return "Turbo!"; }
}
