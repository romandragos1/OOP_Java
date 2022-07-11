package StaticVsNonStatic.Exercitiu4;

public class Person {

    static int counter=0;
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
