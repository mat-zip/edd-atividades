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
        int vetorMetade;
        if (vetor.length % 2 == 0) {
            vetorMetade = vetor.length / 2;
        }else {
            vetorMetade = (vetor.length / 2) + 1;
        }

        if (elemento == vetor[vetorMetade]) {
            return true;
        }

        if (elemento < vetor[vetorMetade]){
            for (int i = 0; i < vetorMetade; i++) {
                if (vetor[i] == elemento) {
                    return true;
                }
            }
        } else {
            for (int i = vetorMetade; i < vetor.length; i++) {
                if (vetor[i] == elemento) {
                    return true;
                }
            }
        }

        return false;
    }
}
