package util;

public class CurrencyConverter {

//    Sempre que for um constante usar FINAL na declaração
    public static final double TAX = 0.06;


    public static double converter(double dollarBought, double dollarPrice) {
        return dollarPrice * dollarBought * (TAX + 1.0);
    }

}
