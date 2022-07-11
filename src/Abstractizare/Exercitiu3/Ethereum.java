package Abstractizare.Exercitiu3;

public class Ethereum extends CryptoCurrency {

    public Ethereum(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        int probabilitate = generator.nextInt(11);
        if (probabilitate <= 5) {
            valueInUSD -= 50.0;
            System.out.println("Ethereum a scazut cu 50 USD");
        } else {
            valueInUSD += 50;
            System.out.println("Ethereum a crescut cu 50 USD");
        }
    }
}
