package Constante.Exercitiu5;

public class Student {

    final String name;
    int year;
    final String major;

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        year = 1;
    }

    public void passYear() {
        if (year < 4) {
            System.out.println("Studentul " + this.name + " cu specializarea " + this.major + " a trecut in anul " + ++year);
        } else {
            System.out.println("Studentul " + this.name + " cu specializarea " + this.major + " a absolvit FELICITARI!!!");
        }
    }
}
