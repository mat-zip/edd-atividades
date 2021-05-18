package com.matheus.busca_ordenacao.busca;

public class Busca {

    public boolean buscaSequencialNaoOrdenada(int[] vetor, int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public boolean buscaSequencialOrdenada(int[] vetor, int elemento) {
        for(int i: vetor) {
            if (elemento <= vetor[i - 1]) {
                return elemento == vetor[i - 1];
            }
        }
        return false;
    }

    public boolean buscaBinaria(int[] vetor, int elemento) {
        int inicio = 0;
        int meio = 0;
        int fim = vetor.length-1;

        if (vetor[meio] == elemento) {
            return true;
        }

        while (inicio <= fim) {
            meio = (fim + inicio) / 2;

            System.out.println("Início: " + vetor[inicio] + " - Meio: " + vetor[meio] + " - Fim: " + vetor[fim]);
            System.out.println("Posiçao: " + inicio + " - Meio: " + meio + " - Fim: " + fim);
            if (vetor[meio] == elemento) {
                return true;
            }

            if (vetor[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }
        return false;
    }
}
