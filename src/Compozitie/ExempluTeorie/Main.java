package Compozitie.ExempluTeorie;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Puma");
        Person person = new Person("Roman", "Dragos", car1);
        Person person2 = new Person("Roman", "Florina", new Car("volkswagen", "T-Cross"));

        System.out.println(person);
        System.out.println(person2);
    }
}
