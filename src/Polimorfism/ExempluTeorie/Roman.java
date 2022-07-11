package Polimorfism.ExempluTeorie;

public class Roman extends Cetatean{

    public Roman(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume+" spune salutari");
//        super.saluta();
    }
}
