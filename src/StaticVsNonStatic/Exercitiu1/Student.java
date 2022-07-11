package StaticVsNonStatic.Exercitiu1;

public class Student {

    static int counter = 1;

    int id;
    String name;

    public Student(String name) {
        this.id = counter++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}