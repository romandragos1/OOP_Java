package Mostenire.Exercitiu4;

public class Premiant extends Student {

    public Premiant(String name, int grade) {
        super(name, grade);
    }

    public void multumeste() {
        System.out.println(this.name + " multumeste profesorilor si parintilor pentru suportul oferit");
    }
}
