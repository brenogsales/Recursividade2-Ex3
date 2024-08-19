package view;

import controller.Ex3;

public class main {
    public static void main(String[] args) {
        int [] sequencia = {11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 2};
        int tamanho = sequencia.length;
        int contador = 0;

        int quantidadePares = Ex3.contaPares(sequencia, tamanho, contador);
        System.out.printf("O vetor tem %d número(s) par(es).", quantidadePares);
    }
}
