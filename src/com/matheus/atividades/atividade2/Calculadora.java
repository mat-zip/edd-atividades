package com.matheus.atividades.atividade2;

public class Calculadora {

    private int maior;
    private int menor;
    private int[] vetor;
    private int index;

    public Calculadora() {
        maior = 0;
        menor = 2147483647;
        index = 0;
    }

    public void criaVetor(int n) {
        vetor = new int[n];
    }

    public void addNumeroNoVetor(int numero) {
        vetor[index] = numero;
        index++;
    }

    public int qtdElementosNoVetor() {
        return index;
    }

    //vetor[] = {2,3,4}

    //4 + 5
    //3 + 2
    //2 + 0
    //0

    public int soma() {
        if(this.index == 0) {
            return 0;
        }

        return vetor[--index] + soma();
    }

    public int soma(int[] n, int i) {
        if (i >= n.length) {
            return 0;
        }

        return n[i] + soma(n, i + 1);
    }

    public int maior(int[] n, int i) {
        if (i >= 0 && i < n.length) {
            if (n[i] > this.maior) {
                this.maior = n[i];
            }
            this.maior = maior(n, i + 1);
        }
        return this.maior;
    }

    public int menor(int[] n, int i) {
        if (i >= 0 && i < n.length) {
            if (n[i] < this.menor) {
                this.menor = n[i];
            }
            this.menor = menor(n, i + 1);
        }
        return this.menor;
    }

    public int multSoma(int x, int y) {
        if (y <= 0) {
            return 0;
        }

        return x + multSoma(x, y - 1);
    }

    public int divisaoSubtraindo(int x, int y) {
        if (x < y) {
            return 0;
        } else if(x <= 0) {
            return 0;
        }
        return divisaoSubtraindo(x - y, y) + 1;
    }

    public int potencia(int x, int n) {
        if (n == 0 || x == 0) {
            return 1;
        }

        return x * potencia(x, n - 1);
    }
}
