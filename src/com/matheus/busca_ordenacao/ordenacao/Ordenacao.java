package com.matheus.busca_ordenacao.ordenacao;

import org.jetbrains.annotations.NotNull;

public class Ordenacao {


    public int[] bubleSort(int  [] vetor) {
        int i, j ,aux;
        for(i = 0; i < vetor.length; i++) {
            for(j = 1; j <= (vetor.length) -1; j++) {
                if (vetor[j-1] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[j-1];
                    vetor[j -1] = aux;
                }
            }
        }
        return vetor;
    }

    public int[] insertionSort(int[] vetor) {
        int i, j, eleito;

        for(i = 1; i <= (vetor.length) -1; i++) {
            eleito = vetor[i];
            j = i-1;
            while((j >= 0) && (vetor[j] > eleito)) {
                vetor[j + 1] = vetor[j];
                j = j-1;
            }
            vetor[j + 1] = eleito;
        }
        return vetor;
    }
}
