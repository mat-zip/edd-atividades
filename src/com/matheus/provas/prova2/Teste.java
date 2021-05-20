package com.matheus.provas.prova2;

import jdk.swing.interop.SwingInterOpUtils;

public class Teste {
    public static void main(String[] args) {

        ClasseOrdenacao ordenacao = new ClasseOrdenacao();
        ClasseBusca busca = new ClasseBusca();
        int[] vetorParaBubble = gerarVetor(10, 20);
        int[] vetorParaBubbleRecusivo = gerarVetor(10, 20);
        int[] vetorParaSelection = gerarVetor(10, 20);
        String[] vetorParaInsertion = {"Matheus", "Ana", "Julia", "Henrique", "Luiz", "Bruno"};
        int[] vetorParaBuscaBinaria = {3,5,6,8,9,15,16,17, 19, 25};

        System.out.println("Vetor para BUBBLE SORT: " + imprime(vetorParaBubble));
        ordenacao.bubbleSortDecrescente(vetorParaBubble);
        System.out.println("Vetor ordenado BUBBLE SORT(decrescente): " + imprime(vetorParaBubble));
        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Vetor para BUBBLE RECURSIVO: " + imprime(vetorParaBubbleRecusivo));
        ordenacao.bubbleSortRecursivo(vetorParaBubbleRecusivo, vetorParaBubbleRecusivo.length);
        System.out.println("Vetor ordenado BUBBLE RECURSIVO(decrescente): " + imprime(vetorParaBubbleRecusivo));
        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Vetor para SELECTION SORT: " + imprime(vetorParaSelection));
        ordenacao.selectionSortSeparado(vetorParaSelection);
        System.out.println("Vetor ordenado SELECTION SORT(método getMIn()): " + imprime(vetorParaSelection));
        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Vetor para INSERTION SORT(ordena Strings): " + imprime(vetorParaInsertion));
        ordenacao.insertionSortString(vetorParaInsertion);
        System.out.println("Vetor ordenado INSERTION SORT: " + imprime(vetorParaInsertion));
        System.out.println("-----------------------------------------------------------------------\n");
        System.out.println("Vetor para BUSCA BINÁRIA: " + imprime(vetorParaBuscaBinaria));
        System.out.println(busca.buscaBinaria(vetorParaBuscaBinaria, 5));
    }

    /**
     * Gera um vetor com números aleatórios de tamanho n
     * @param tamanho - tamanho que o vetor deve ter
     * @param rangeDeElementos - até qual número o método pode gerar um número aleatório
     * ex: rangeDeElementos = 20 irá gerar de 0 até 20 número aleatórios para inserir no
     * vetor
     *
     * @return retorna o vetor populado com base nas especificações dos parâmetros
     */
    public static int[] gerarVetor(int tamanho, int rangeDeElementos) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * rangeDeElementos);
        }

        return vetor;
    }

    /**
     * Imprime um vetor no formato: [*,*,*,*,*,*]
     * @param vetor - Vetor que irá ser impresso
     * @return - String formata com o vetor para a impressão
     */
    public static String imprime(int[] vetor) {
        String str = "[";
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length-1){
                str += vetor[i] +"]";
                break;
            }

            str += vetor[i] + ",";
        }
        return str;
    }

    /**
     * Imprime um vetor no formato: [*,*,*,*,*,*]
     * @param vetor - Vetor que irá ser impresso
     * @return - String formata com o vetor para a impressão
     */
    public static String imprime(String[] vetor) {
        String str = "[";
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length-1){
                str += vetor[i] +"]";
                break;
            }

            str += vetor[i] + ",";
        }
        return str;
    }


}
