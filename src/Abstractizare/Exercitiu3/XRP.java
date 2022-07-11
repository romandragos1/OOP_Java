package Abstractizare.Exercitiu3;

public class XRP extends CryptoCurrency {

    public XRP(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        int probabilitate = generator.nextInt(11);
        if (probabilitate <= 2) {
            valueInUSD -= 30.0;
            System.out.println("XRP a scazut cu 30 USD");
        } else {
            valueInUSD += 10;
            System.out.println("XRP a crescut cu 10 USD");
        }
    }
}
