package Mostenire.Exercitiu6;

public class Staff {

    String name;
    int salary;

    public Staff(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
