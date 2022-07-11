package Compozitie.Exercitiu2;

public class Person {

    String firstName;
    String lastName;
    Person bestFriend;

    public Person(String firstName, String lastName, Person bestFriend) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bestFriend = bestFriend;
    }

    public void printFriendship() {
        System.out.println(firstName + " este prietenul cel mai bun al lui " + bestFriend.firstName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bestFriend=" + bestFriend +
                '}';
    }
}
