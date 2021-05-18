package com.matheus.provas.prova2;

public class ClasseBusca {

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
            System.out.println("Posicao: " + inicio + " - Meio: " + meio + " - Fim: " + fim);
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




    /**
     * Método de busca binária recursiva tirado do vídeo: https://www.youtube.com/watch?v=EgLE5HwRy_M
     * @param vetor - Vetor ORDENADO no qual irá ser percorrido para encontrar o elemento
     * @param item - elemento que irá ser procurado
     * @param inicio - começo do vetor
     * @param fim - vim do vetor
     * @return - true se o elemento existe no vetor e false caso contrário
     */
    public boolean buscaBinariaRecursiva(int[] vetor, int item,int inicio, int fim ) {
        if (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == item){
                return true;
            }
            if (item < vetor[meio]) {
                return buscaBinariaRecursiva(vetor, item, inicio, meio -1 );
            } else {
                return buscaBinariaRecursiva(vetor, item, meio + 1, fim);
            }
        }

        return false;
    }
}
