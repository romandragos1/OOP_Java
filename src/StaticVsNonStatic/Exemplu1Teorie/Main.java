package StaticVsNonStatic.Exemplu1Teorie;

public class Main {

    public static void main(String[] args) {

        // Functionalitati de care ne folosim extrase in clase specifice
        System.out.println("Introduceti un text:");
        String textIntrodus = Cititor.citesteText();
        System.out.println(textIntrodus);

        System.out.println("Introduceti un numar:");
        int numarIntrodus = Cititor.citesteNumar();
        System.out.println(numarIntrodus);

        int suma = Calculator.aduna(10,20);
        int diferenta = Calculator.scade(100,40);
        System.out.println(suma);
        System.out.println(diferenta);
    }
}
