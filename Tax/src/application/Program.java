package application;

import entities.Company;
import entities.Individual;
import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Pessoa p1 = new Individual(name, anualIncome, healthExpenditures);
                list.add(p1);
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                Integer numberEmployees = sc.nextInt();
                Pessoa p2 = new Company(name, anualIncome, numberEmployees);
                list.add(p2);
            }
        }

        System.out.println("TAXES PAID: ");
        for (Pessoa pes:list) {
            System.out.println(pes.getName() + ": $ " + String.format("%.2f", pes.tax()));
        }

        double sum = 0;
        for (Pessoa pes:list) {
            sum += pes.tax();
        }

        System.out.printf("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
