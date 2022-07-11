package Mostenire.Exercitiu4;

public class Corigent extends Student {

    public Corigent(String name, int grade) {
        super(name, grade);
    }

    public void invata() {
        System.out.println(this.name + " invata si repeta materia pentru a promova");
    }
}
