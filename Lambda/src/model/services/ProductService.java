package model.services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

//    Funcao para filtrar produtos de uma lista com Predicate
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
//            Vai testar a funcao e caso seja verdadeiro vai somar o preço do produto em SUM
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
