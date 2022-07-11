package Mostenire.ExempluTeorie;

public class Ford extends Car{

    public Ford(String marca, String model){
        super(marca, model);
        System.out.println("Am generat un autoturism Ford");
    }

    @Override
    public String toString() {
        return "Ford{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
