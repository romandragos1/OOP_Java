package ClaseSiObiecte.Exercitiu10;

public class Pencil {

    String color;
    int remainingInk;

    public Pencil(String color) {
        this.color = color;
        remainingInk = 1000;
    }

    public void write(String text) {
//        remainingInk-=text.length(); // Nu este o metoda eficienta deoarece se ia in calcul si caracterul "space";
        char[] litere = text.toCharArray();
        for (char c : litere) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                remainingInk--;
            }
        }
        System.out.println(text);
    }
}
