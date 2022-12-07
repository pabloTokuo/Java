package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

//        Matiz de tamanho n e m
        int[][] matrix = new int[n][m];

//        Para criar matriz bidimensional utilizar 2 for
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++){
//              Linha I e Coluna J
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
//                Se I e J for igual X
                if (matrix[i][j] == x) {
//                    Printar posicao de I e J
                    System.out.println("Position: " + i + "," + j + ":");
                    if (matrix[i][j] == x) {
//                        Printar matriz de I e J-1
//                        Lembrando que I = Linha e J = Coluna
//                        Então vai printar um numero antes de X
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
//                    Se Coluna J for menor que Linha -1
                    if (j < matrix[i].length-1) {
//                        Printar matriz de I e J+1
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (matrix[i][j]== x) {
//                        Printar linha em baixo do X
//                        Por isso I+1 para pular a linha de X
//                        E J para printar a linha abaixo de X
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
