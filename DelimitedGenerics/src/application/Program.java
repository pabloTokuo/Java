package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";
//        Abrir arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
//                Cria vetor e separa string baseado na virgula e dps guarda no vetor
                String[] fields = line.split(",");
//                instancia Objeto dentro do list.add
//                dps passa nome do produto na posicao 0
//                dps passa preco do produto na posicao 1 convertendo em Double pq ele estava em String
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
//                Ler proxima linha
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}