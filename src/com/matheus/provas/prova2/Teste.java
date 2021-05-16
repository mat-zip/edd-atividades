package com.matheus.provas.prova2;

public class Teste {
    public static void main(String[] args) {
        ClasseOrdenacao ordenacao = new ClasseOrdenacao();
        int[] matriz = gerarMatriz(10, 20);
        String[] matrizString = {"Matheus", "Ana", "Julia", "Henrique", "Luiz", "Bruno"};

        System.out.println(imprime(matrizString));
        ordenacao.insertionSortString(matrizString);
        System.out.println(imprime(matrizString));
    }

    public static int[] gerarMatriz(int tamanho, int rangeDeElementos) {
        int[] matriz = new int[tamanho];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int)(Math.random() * rangeDeElementos);
        }

        return matriz;
    }

    public static String imprime(int[] matriz) {
        String str = "[";
        for (int i = 0; i < matriz.length; i++) {
            if (i == matriz.length-1){
                str += matriz[i] +"]";
                break;
            }

            str += matriz[i] + ",";
        }
        return str;
    }

    public static String imprime(String[] matriz) {
        String str = "[";
        for (int i = 0; i < matriz.length; i++) {
            if (i == matriz.length-1){
                str += matriz[i] +"]";
                break;
            }

            str += matriz[i] + ",";
        }
        return str;
    }


}
