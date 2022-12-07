package application;

import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        Employee os1;

        System.out.print("Enter the number of employees: ");
        Integer n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            String outsourced = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double perHour = sc.nextDouble();
            if (Objects.equals(outsourced, "y")) {
                System.out.print("Additional charge: ");
                Double addiotionalCharge = sc.nextDouble();
                os1 = new OutsorcedEmployee(name, hours, perHour, addiotionalCharge);
                list.add(os1);
            } else {
                Employee e1 = new Employee(name, hours, perHour);
                list.add(e1);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }
}
