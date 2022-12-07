package application;

import util.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there an inital deposit (y/n)? ");
        char ini = sc.nextLine().charAt(0);

        if (ini == 'y') {
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            acc = new Account(number, name, deposit);
        } else {
            acc = new Account(number, name);
        }

        System.out.println("Account data: ");
        System.out.println(acc);

        System.out.println("");

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(acc);

        System.out.println("");

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(acc);

        sc.close();
    }
}