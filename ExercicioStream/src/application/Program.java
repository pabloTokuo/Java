package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

//            Transforma a lista em Stream e pega o preço de cada Product
//            Apos isso reduzir o preço tal q começa em 0.0 e elemento x e y vai retornar x + y
//            Quando tiver o resultado todo de Product dividir pelo tamanho da lista

            Double avg = list.stream().map(Product::getPrice).reduce(0.0, (x, y) -> x+y) / list.size();
            System.out.println("Average price: " + String.format("%.2f", avg));

//            Comp recebe String1 e String2 sendo que s1 transforma em maisculo e compara com s2 transforma em maisculo
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

//            Lista de nomes transforma em stream e filtrar o elemento P tal q Preço de P seja menor q AVG
//            Apos isso separar os nomes de Product
//            E ordenar e transformar em lista
            List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(Product::getName).sorted().toList();

//            ForEach na lista de Names
//            Usar method reference em
//            System.out println para printar
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Eror: " + e.getMessage());
        }

        sc.close();
    }
}
