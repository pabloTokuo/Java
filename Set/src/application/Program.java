package application;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

//      HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
//      TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
//      LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
        Set<String> set = new TreeSet<>();
//      Set<String> set = new HashSet<>();
//      Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}

