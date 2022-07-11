package Polimorfism.Exercitiu4;

public class CappuccinoMaker extends CoffeMaker {

    public void addMilk() {
        System.out.println("Am adaugat lapte");
    }

    public void addSugar() {
        System.out.println("Am adaugat zahar");
    }

    @Override
    public void prepareCoffe() {
        addCoffe();
        addMilk();
        addSugar();
    }
}
