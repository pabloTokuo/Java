package application;

import entities.BoardinSchool;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BoardinSchool[] rent = new BoardinSchool[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

//          Vetor do indice digitado pelo usuario
            rent[room] = new BoardinSchool(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i=0; i<10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        sc.close();
    }
}
