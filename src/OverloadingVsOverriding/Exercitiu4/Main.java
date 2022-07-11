package OverloadingVsOverriding.Exercitiu4;

public class Main {

    public static void main(String[] args) {

// Exercitiu 4 - Creati clasa AzimutVision cu metoda pass(String studentName), care va printa un mesaj
// "Studentul X a absolvit cursurile AzimutVision";
// Supraincarcati metoda pentru a primi oricati studenti doreste utilizatorul.

        AzimutVision azimutVision = new AzimutVision();
        azimutVision.pass("Dragos Roman");
        azimutVision.pass("Dragos Roman", "Popescu Valentin", "Palade Mirela");
    }
}
