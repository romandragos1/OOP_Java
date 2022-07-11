package Mostenire.ExempluTeorie;

public class Main {

    public static void main(String[] args) {

        Ford ford = new Ford("Ford", "Focus");                 // Definim fiecare tip de autoturism
        Hyundai hyundai = new Hyundai("Hyundai", "I30");

        ford.startEngine();         // Apelam metodele fiecarui autoturism
        hyundai.startEngine();
        hyundai.accelerate();

        System.out.println(ford);           // Printam la consola detaliile fiecarui autoturism
        System.out.println(hyundai);
    }
}
