package StaticVsNonStatic.Exemplu1Teorie;

import java.util.Scanner;

public class Cititor {

    // Fielduri statice
    static Scanner cititorText = new Scanner(System.in);

    static Scanner cititorNumere = new Scanner(System.in);

    // Metode statice
    public static String citesteText(){
        return cititorText.nextLine();
    }

    public static int citesteNumar(){
        return cititorNumere.nextInt();
    }
}
