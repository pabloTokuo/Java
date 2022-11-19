package application;

import entities.Product;

import java.util.Comparator;

// Implementa interface Comparator em uma Classe exclusiva pra ela
// Assim fica mais flexivel a mudança a classe Product
public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
