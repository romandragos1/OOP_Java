package Constante.Exercitiu7;

public class Main {

    public static void main(String[] args) {

// Exercitiu 7 - Creati clasa Car cu proprietatile String marca, String model, boolean on, si metodele startEngine(), stopEngine() si accelerate();
// Creati clasele copil Ford, Dacia si Hyundai; Clasele copil nu vor putea suprascrie metodele startEngine() si stopEngine() insa vor avea
// propria implementare a metodei accelerate();
// Initializati o masina de fiecare tip, porniti, acccelerati si apoi opriti masina.

        Ford ford = new Ford("Ford", "Focus");                  // Initializam cate o masina din fiecare
        Dacia dacia = new Dacia("Dacia", "Sandero");
        Hyundai hyundai = new Hyundai("Hyundai", "Elantra");

        ford.startEngine();     // Porniti x 2,  acccelerat x2 si apoi oprit x 2 Ford Focus
        ford.startEngine();
        ford.accelerate();
        ford.accelerate();
        ford.stopEngine();
        ford.stopEngine();

        dacia.startEngine();    // Pornit, acccelerat si apoi oprit Dacia Sandero
        dacia.accelerate();
        dacia.stopEngine();

        hyundai.startEngine();  // Pornit, acccelerat si apoi oprit Hyundai Elantra
        hyundai.accelerate();
        hyundai.stopEngine();
    }
}
