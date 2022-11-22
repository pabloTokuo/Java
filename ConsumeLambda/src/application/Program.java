package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


//        Tipo Consumer
//        percorre a lista pegando o preco e adicionando 10%
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

//        usando reference method para o metodo println
//        list.forEach(System.out::println);
        for (Product p : list) {
            System.out.println(p);
        }

    }
}
