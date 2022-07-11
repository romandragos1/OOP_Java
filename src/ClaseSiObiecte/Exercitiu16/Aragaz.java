package ClaseSiObiecte.Exercitiu16;

public class Aragaz {

    boolean isGasConnected;
    boolean eyeOneIsLit;
    boolean eyeTwoIsLit;
    boolean eyeThreeIsLit;
    boolean eyeFourIsLit;

    public void coupleGas() {
        if (isGasConnected) {
            System.out.println("Gazul este deja conectat");
        } else {
            isGasConnected = true;
            System.out.println("Gazul a fost conectat");
        }
    }

    public void decoupleGas() {
        if (isGasConnected) {
            isGasConnected = false;
            System.out.println("Gazul a fost decuplat");
        } else {
            System.out.println("Gazul este deja deconectat");
        }
    }

    public void pressFirstEyeButton() {
        if (eyeOneIsLit) {
            System.out.println("Ochiul 1 a fost stins");
            eyeOneIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("Ochiul 1 a fost aprins");
                eyeOneIsLit = true;
                securityCheck();
            } else {
                System.out.println("Gazul nu este conectat");
            }
        }
    }

    public void pressSecondEyeButton() {
        if (eyeTwoIsLit) {
            System.out.println("Ochiul 2 a fost stins");
            eyeTwoIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("Ochiul 2 a fost aprins");
                eyeTwoIsLit = true;
                securityCheck();
            } else {
                System.out.println("Gazul nu este conectat");
            }
        }
    }

    public void pressThirdEyeButton() {
        if (eyeThreeIsLit) {
            System.out.println("Ochiul 3 a fost stins");
            eyeThreeIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("Ochiul 3 a fost aprins");
                eyeThreeIsLit = true;
                securityCheck();
            } else {
                System.out.println("Gazul nu este conectat");
            }
        }
    }

    public void pressFourthEyeButton() {
        if (eyeFourIsLit) {
            System.out.println("Ochiul 4 a fost stins");
            eyeFourIsLit = false;
        } else {
            if (isGasConnected) {
                System.out.println("Ochiul 4 a fost aprins");
                eyeFourIsLit = true;
                securityCheck();
            } else {
                System.out.println("Gazul nu este conectat");
            }
        }
    }

    public void securityCheck() {
        if (eyeOneIsLit && eyeTwoIsLit && eyeThreeIsLit && eyeFourIsLit) {
            System.out.println("WARNING. Aragazul a fost stins si gazul decuplat.");
            eyeOneIsLit = false;
            eyeTwoIsLit = false;
            eyeThreeIsLit = false;
            eyeFourIsLit = false;
            decoupleGas();
        }
    }
}