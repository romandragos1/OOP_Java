package Interfete.Exercitiu4;

public class Calculator implements Startable, Stopable {

    String marca;
    int ram;
    boolean on;

    public Calculator(String marca, int ram) {
        this.marca = marca;
        this.ram = ram;
        on = false;
    }

    @Override
    public void start() {
        if (on) {
            System.out.println("Calculatorul este deja pornit");
        } else {
            System.out.println("Am pornit calculatorul");
            on = true;
        }
    }

    @Override
    public void stop() {
        if (on) {
            System.out.println("Am oprit calculatorul");
            on = false;
        } else {
            System.out.println("Calculatorul este deja oprit");
        }
    }
}