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
        int fim = vetor.length -1;
        int meio;
        boolean encontrado = false;

        if (vetor.length % 2 == 0) {
            meio = vetor.length / 2;
        }else {
            meio = (vetor.length / 2) + 1;
        }

        for(int i = 0; i < vetor.length; i++) {
            if (elemento < vetor[meio]){
                fim = meio -1;
                meio = meio / 2;
                try {
                    if (elemento == vetor[meio] || elemento != vetor[meio] && meio == 0) {
                        return true;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    return false;
                }
            } else {
                meio += 1;
                try {
                    if (elemento == vetor[meio] || elemento != vetor[meio] && meio == fim) {
                        return true;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    return false;
                }
            }
        }

        return false;
    }
}
