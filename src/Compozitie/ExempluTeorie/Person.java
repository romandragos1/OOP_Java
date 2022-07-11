package Compozitie.ExempluTeorie;

public class Person {

    String firsName;
    String lastName;
    Car masina;

    public Person(String firsName, String lastName, Car masina) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.masina = masina;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", masina=" + masina +
                '}';
    }
}
