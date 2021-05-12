package com.matheus.busca_ordenacao.ordenacao;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] idade_vetor = new int[]{8,9,6,3,1,4};

        Ordenacao o = new Ordenacao();

        //Bubble Sort
        System.out.println("Bubble Sort: " + Arrays.toString(o.bubleSort(idade_vetor)));

        //Insert Sort
        idade_vetor = new int[]{8, 9, 6, 3, 1, 4};
        System.out.println("Insert Sort: " + Arrays.toString(o.insertionSort(idade_vetor)));

    }
}
