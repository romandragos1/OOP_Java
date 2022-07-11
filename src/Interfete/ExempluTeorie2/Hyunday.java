package Interfete.ExempluTeorie2;

public class Hyunday implements Drivable {
    @Override
    public void startEngine() {
        System.out.println("Hyundai a pornit motorul");
    }

    @Override
    public void stopEngine() {
        System.out.println("Hyundai a oprit motorul");
    }

    @Override
    public void drive() {
        System.out.println("Conducem Hyundai");
    }
}
