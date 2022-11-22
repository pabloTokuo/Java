package application;

import java.util.Arrays;

public class Program {
    /*
    *   Uma função possui transparência referencial se seu resultado for sempre o mesmo
        para os mesmos dados de entrada. Benefícios: simplicidade e previsibilidade.
    */

//    Variavel global
    public static int globalValue = 3;

    public static void main(String[] args) {

        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

//    O numero que for diferente de 0
//    Vai somar com a variavel global
    private static void changeOddValues(int[] vect) {
        for (int i=0; i<vect.length; i++) {
            if (vect[i] % 2 != 0) {
                vect[i] += globalValue;
            }
        }
    }
}

/*
* Função que não é referencialmente transparente
*/