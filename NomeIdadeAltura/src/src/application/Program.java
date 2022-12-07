package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();

        People[] vect = new People[n];

        String name;
        int age = 0;
        double height = 0;

        for (int i=0; i<vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            sc.nextLine();
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();

            vect[i] = new People(name, age, height);
        }

        double alturaTotal = 0;
        for (int i=0; i<vect.length; i++) {
            alturaTotal += vect[i].getHeight();
        }
        
        double alturaMedia = alturaTotal / vect.length;

        System.out.printf("Altura média: %.2f%n", alturaMedia);

        double menorIdade = 0;
        for (int i=0; i<vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menorIdade++;
            }
        }

        double porcentagem = (menorIdade / vect.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f" , porcentagem);
        System.out.println("%");

        String nomeMenor;
        for (int i=0; i<vect.length; i++) {
            if (vect[i].getAge() < 16) {
                nomeMenor = vect[i].getName();
                System.out.println(nomeMenor);
            }
        }

        sc.close();
    }
}
