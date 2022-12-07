package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

//            Condicão recebendo função para verificar se tem ID
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

//          Instanciando objeto do tipo Employee
            Employee employee = new Employee(id, name, salary);
//          Add na lista objeto instanciado
            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
//      Verificando se employee id é igual id digitado, se for, pegar o primeiro, se não null
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

//      Condicão verificando se ID é existente, se for, entrar porcentagem para aumento do salario
        if (employee == null) {
            System.out.println("That id doest not exist!!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

//      Para cada objeto "emp" contido em list, leia emp
        for (Employee emp: list) {
            System.out.println(emp);
        }

        sc.close();
    }

//    Função para verificar se existe um ID igual ID digitado
    public static boolean hasId(List<Employee> list, int id) {
//        Verificando se existe funcionario "x tal que x.getId seja igual Id digitado", encontrar o primeiro caso n encontrar retorna NULL
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//        return emp id diferente de null
        return emp != null;
    }
}
