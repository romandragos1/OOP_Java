package ClaseSiObiecte.Exercitiu16;

public class Main {

    public static void main(String[] args) {

// Exercitiu 16 - Creati clasa Aragaz, cu urmatoarele fielduri: boolean isGasConnected, eyeOneIsLit, eyeTwoIsLit, eyeThreeIsLit, eyeFourIsLit
// si urmatoarele metode: coupleGas(), decoupleGas(), pressFirstEyeButton(), pressSecondEyeButton(), pressThirdEyeButton(), pressFourthEyeButton();
// Fiecare metoda va aprinde ochiul respectiv daca este stins si il va stinge daca este aprins;
// Daca utilizatorul va aprinde toate cele 4 ochiuri, ca metoda de siguranta, toate ochiurile se vor stinge si gazul va fi decuplat;
// Creati un Aragaz si testati toate functionalitatile acestuia.

        Aragaz aragaz = new Aragaz();   // Initializam un aragaz
        aragaz.coupleGas();             // Conectam gazul la aragaz
        aragaz.pressFirstEyeButton();   // Aprindem si inchidem primul ochi de 3 ori
        aragaz.pressFirstEyeButton();
        aragaz.pressFirstEyeButton();
        aragaz.pressSecondEyeButton();  // Aprindem ochiul 2
        aragaz.pressThirdEyeButton();   // Aprindem ochiul 3
        aragaz.pressFourthEyeButton();  // Aprindem toate ochiurile aragazului pentru activare metoda de siguranta
    }
}