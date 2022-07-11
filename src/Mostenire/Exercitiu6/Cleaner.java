package Mostenire.Exercitiu6;

public class Cleaner extends Staff {

    public Cleaner(String name, int salary) {
        super(name, salary);
    }

    public void clean() {
        System.out.println(this.name + " face curat");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
