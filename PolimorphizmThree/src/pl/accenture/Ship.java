package pl.accenture;

public class Ship extends Vehicle {
    @Override
    void Base() { System.out.println("Ship Base"); }

    public String GetShipName() { return "Is a ship"; }
}
