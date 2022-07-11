package Mostenire.ExempluTeorie;

public class Hyundai extends Car{

    boolean autoPilot;

    public Hyundai(String marca, String model) {
        super(marca, model);
        System.out.println("Am generat un autoturism Hyundai");
    }

    public void accelerate(){
        System.out.println("Autoturismul Hyundai accelereaza");
    }

    @Override
    public String toString() {
        return "Hyundai{" +
                "autoPilot=" + autoPilot +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
