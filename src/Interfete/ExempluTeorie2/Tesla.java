package Interfete.ExempluTeorie2;

public class Tesla implements Drivable, ElectriCar {
    @Override
    public void startEngine() {
        System.out.println("Tesla a pornit motorul");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tesla a oprit motorul");
    }

    @Override
    public void drive() {
        System.out.println("Tesla se conduce");
    }

    @Override
    public void charge() {
        System.out.println("Conducem Tesla");
    }
}
