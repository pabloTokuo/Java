package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

//        Transforma a lista em uma stream e passa por cada elemento X da lista com o map // MAP é uma operacao intermediaria
//        E fazendo a operacao com cada elemento da Lista
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
//        toArray é uma operacao terminal
        System.out.println(Arrays.toString(st1.toArray()));

//        Stream de Strings contendo uma lista de Nomes
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

//      Repeticao com Stream
//        Começa em 2 e vai somando o i com + 2;
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
//        Na saida colocar o tamanho da stream
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

//        Seq Fibonacci
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
