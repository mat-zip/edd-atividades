package com.matheus.busca_ordenacao.busca;

public class Main {
    public static void main(String[] args) {
        Busca b = new Busca();

        int[] vetor_desordenado = new int[]{5,8,7,4,1,2,3};
        b.buscaSequencialNaoOrdenada(vetor_desordenado, 6);

        int[] vetor_ordenado = new int[]{1,2,3,4,5,6};
        b.buscaSequencialOrdenada(vetor_ordenado, 1);

        int[] vetor_ordenado_binario = new int[]{10,11,12,13,14,15,16};
        System.out.println(b.buscaBinaria(vetor_ordenado_binario, 10));

    }
}
