package Abstractizare.Exercitiu3;

import java.util.Random;

public abstract class CryptoCurrency {

    protected Random generator = new Random();
    double valueInUSD;

    public CryptoCurrency(double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }

    public abstract void changeValue();
}
