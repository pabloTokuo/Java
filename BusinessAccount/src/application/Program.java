package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(1001, "Bob", 500.0, 0.01);
        acc1.withdraw(400.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1002, "Ana", 1000.0, 500.0);
        acc2.withdraw(800.00);
        System.out.println(acc2.getBalance());
    }
}