package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double dollarToReal (double dollarPrice, double dollar) {
        return (dollar + (dollar * IOF)) * dollarPrice;
    }
}