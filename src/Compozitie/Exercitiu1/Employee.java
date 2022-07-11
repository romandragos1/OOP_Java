package Compozitie.Exercitiu1;

public class Employee {

    String firstName;
    String lastName;
    Laptop laptop;

    public Employee(String firstName, String lastName, Laptop laptop) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
