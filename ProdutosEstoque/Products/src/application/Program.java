package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//      Criando objeto product do tipo Products

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine(); // Entrada nome produto

        System.out.print("Price: ");
        double price = sc.nextDouble(); // Entrada preço produto

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt(); // Entrada quantidade produto
        Products product = new Products(name, price);

        System.out.println("");
        System.out.println("Product data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");

        quantity = sc.nextInt(); // Variavel para adicionar produto no estoque
        product.addProducts(quantity); // Chamando a função para adicionar

        System.out.println("");
        System.out.println("Updated data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be removed from stock: ");

        int remove = sc.nextInt(); // Removendo produto do estoque
        product.removeProducts(remove); // Função para remover produto

        System.out.println("");
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
