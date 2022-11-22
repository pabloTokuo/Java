package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

//        Funcao que recebe uma Lista e uma funcao lambda
//        Vai percorrer a lista dando preferencia para produtos que começa com letra T
        double sum = ps.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
