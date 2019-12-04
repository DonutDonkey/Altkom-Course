package pl.accenture;

public class Plane extends Vehicle {
    @Override
    void Base() { System.out.println("Plane base"); }

    public String GetPlaneName() { return "Is a plane"; }
}
