package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

//        Sempre que transformar uma lista em stream no final dela precisa voltar ela pro tipo lista
//        Map vai percorrer por cada produto e pegando o nome e transformando em upperCase
//        No final vai voltar a lista para um tipo Lista
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
