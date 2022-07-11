package OverloadingVsOverriding.Exercitiu1;

public class ConsolePrinter {

    public void printText(String text) {
        System.out.println(text);
    }

    public void printText(String text, int numarPrintariConsola) {
        for (int i = 0; i < numarPrintariConsola; i++) {
            System.out.println(text);
        }
    }
}
