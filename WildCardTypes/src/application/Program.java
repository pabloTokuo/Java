package application;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Maria", "Bob");
        printList(myStr);
    }

//    Para que a lista seja do tipo Generico ou "Qualquer"
//    Precisa criar a lista com o generics "?"

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

/*
List<?> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers;
*/

// Não é possível add dados em uma lista generica do tipo `qualquer`
// O compilador não consegue reconhecer qual o tipo da lista
// ex: vc tem uma lista de string e quer adicionar o numero 3
// O compilador não vai aceitar

/*
public class Program {
public static void main(String[] args) {
List<?> list = new ArrayList<Integer>();
list.add(3); // erro de compilação
}
}
 */