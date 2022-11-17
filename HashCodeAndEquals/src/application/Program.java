package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Bob", "bob@gmail.com");
        Client c2 = new Client("Bob", "bob@gmail.com");

//        Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes
//        Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

//        Equals é mais lento mas tem mais certeza que o resultado é correto
        System.out.println(c1.equals(c2));

//        == pega a referencia do Objeto
//        No caso esta pegando o lugar na memoria do Objeto
//        e como estão em diferentes locais
//        ele da como Falso
        System.out.println(c1 == c2);
    }
}
