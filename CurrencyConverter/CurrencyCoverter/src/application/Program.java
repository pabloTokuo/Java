package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Whats is the dollar price: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollar will be bought: ");
        double dollarBought = sc.nextDouble();

        double total = CurrencyConverter.converter(dollarBought, dollarPrice);


        System.out.printf("Amount to be paid in reais = %.2f", total);


        sc.close();
    }
}