package ClaseSiObiecte.Exercitiu17;

public class Main {

    public static void main(String[] args) {

// Exercitiu 17 - Creati clasa AirConditioner, cu fieldurile boolean on, int temperature, boolean swinging si metodele turnOn(), turnOff(),
// raiseTemperature(), lowerTemperature() si swing(); AC-ul va avea limita de grade intre 0 - 30;
// Suprascrieti metoda toString pentru a printa starea actuala a fiecarui aer conditionat;
// Creati un aer conditionat si testati functionalitatile acestuia.

        AirConditioner ac = new AirConditioner();   // Initializam un AC
        ac.turnOn();                                // Pornim AC-ul
        ac.raiseTemperature();                      // Crestem temperatura AC-ului cu 1 grad
        ac.raiseTemperature();                      // Crestem temperatura AC-ului cu 3 grade
        ac.raiseTemperature();
        ac.raiseTemperature();
        ac.swing();                                 // Pornim balansul AC-ului
        System.out.println(ac);                     // Printam informatiile AC-ul
        ac.swing();                                 // Oprim balansul AC-ului
        ac.lowerTemperature();                      // Descrestem temperatura AC-ului cu 1 grad
        System.out.println(ac);                     // Printam din nou informatiile AC-ul
    }
}