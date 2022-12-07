package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Shape #" + (i+1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'r') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                sc.nextLine();
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                Shape rec = new Rectangle(color, width, height);
                list.add(rec);
            } else if (ch == 'c') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                sc.nextLine();
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                Shape circ = new Circle(color, radius);
                list.add(circ);
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape sh:list) {
            System.out.printf("%.2f%n", sh.area());
        }



    }
}
