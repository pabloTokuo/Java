package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
//        Lista de tipo generico
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Bob", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Alex", 1000.00, 500.00));
        list.add(new SavingsAccount(1003, "Maria", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Antonio", 500.00, 500.00));

        double sum = 0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total accounts balance: %.2f%n", sum);

//        Depositando 10.00 para cada conta
        for (Account acc : list) {
            acc.deposit(10.00);
        }

//        ForEach para verificar saldo
        for (Account acc:list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }
}
