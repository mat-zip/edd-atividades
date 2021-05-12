package com.matheus.busca_e_ordenacao;

public class Ordenacoes {



    public static int[] selectionSort(int[] vetor) {
        int i, j, eleito, menor, posicao = 0;

        for (i = 0; i <= (vetor.length) - 2; i++) {
            eleito = vetor[i];
            menor = vetor[i +1];
            posicao = i + 1;

            for(j = i+2; j <=(vetor.length) -1; j++) {
                if (vetor[j] < menor){
                    menor = vetor[j];
                    posicao = j;
                }
            }
            if (menor < eleito) {
                vetor[i] = vetor[posicao];
                vetor[posicao] = eleito;
            }
        }
        return vetor;
    }
}
