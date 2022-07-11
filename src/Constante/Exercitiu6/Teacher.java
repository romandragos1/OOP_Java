package Constante.Exercitiu6;

public class Teacher {

    String name;
    int age;
    final String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
