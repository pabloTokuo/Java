package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantras pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i=0; i<vect.length; i++) {
            System.out.println("Dados da "+ (i + 1) + "a pessoa");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Pessoa(name, age);
        }

        String idadeMaior = null;
        int idade = 0;
        for (int i=0; i<vect.length; i++) {
            if (vect[i].getAge() > idade) {
                idade = vect[i].getAge();
                idadeMaior = vect[i].getName();
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + idadeMaior);
    }
}
