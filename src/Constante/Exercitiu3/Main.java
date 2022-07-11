package Constante.Exercitiu3;

public class Main {

    public static void main(String[] args) {

// Exercitiu 3 - Creati clasa Animal cu urmatoarele proprietati: String name, int hungerLevel si metodele makeSound() si eat();
// Creati clasele copil Lion, Dog si Cat, restrictionand posibilitatea de a suprascrie metoda eat(). Fiecare animal va scoate sunetul corespunzator;
// Initializati un obiect de fiecare tip. Faceti ca toate animalele sa manance si sa scoata sunete.

        Lion leu = new Lion("Simba");         // Initializam si cream cate un animal
        Dog caine = new Dog("Charlie");
        Cat pisica = new Cat("Nobel");

        leu.eat();              // Toate animalele mananca
        caine.eat();
        pisica.eat();

        leu.makeSound();        // Toatae animalele scot sunete
        caine.makeSound();
        pisica.makeSound();
    }
}
