package Interfete.Exercitiu2;

public class Main {

    public static void main(String[] args) {

// Exercitiu 2 - Declarati clasele Human, Cat, Submarine, si interfetele Swimable cu metoda void swin() si Eatable cu metoda void eat();
// Stabiliti contractele necesare si initializati cate un obiect de tip human, cat si submarine si apelati functionalitatile;

        Human human = new Human();      // Initializam si cream cate un obiect din fiecare tip
        Cat cat = new Cat();
        Submarine submarine = new Submarine();

        human.eat();            // Apelam metodele declarate pentru fiecare obiect
        human.swim();
        cat.eat();
        submarine.swim();
    }
}
