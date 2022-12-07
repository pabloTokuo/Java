package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        Integer n = sc.nextInt();;

        for (int i=0; i<n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                Product p1 = new ImportedProduct(name, price, fee);
                list.add(p1);
            } else if (ch == 'c') {
                Product p2 = new Product(name, price);
                list.add(p2);
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufacture = sdf.parse(sc.next());
                Product p3 = new UsedProduct(name, price, manufacture);
                list.add(p3);
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
