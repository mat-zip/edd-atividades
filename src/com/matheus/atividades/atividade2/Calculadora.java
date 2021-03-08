package com.matheus.atividades.atividade2;

public class Calculadora {

    int maior = 0;
    int menor = 2147483647;
    // n[] = [3, 5, 1, 2, 4]

    public int soma(int[] n, int i) {
        int sum = 0;

        if(i >=0 && i < n.length){
            sum = n[i] + soma(n,i+1);
        }

        return sum;
    }

    public int maior(int[] n, int i) {
        if (i >= 0 && i < n.length) {
            if(n[i] > this.maior){
                 this.maior = n[i];
            } 
            this.maior = maior(n,i+1);
        }
        return this.maior;
    }

    public int menor(int[] n, int i) {
        if (i >= 0 && i < n.length) {
            if(n[i] < this.menor){
                this.menor = n[i];
            }
            this.menor = menor(n,i+1);
        }
        return this.menor;
    }

    public int multSoma(int x, int y) {
        if(y <= 0) {
            return 0;
        }

        return x + multSoma(x, y-1);
    }

    public int divisaoSubtraindo(int x, int y) {
        if(x <= 0){
            return 0;
        }

        return divisaoSubtraindo(x-y, y ) + 1;
    }

    public int potencia(int x, int n){
        if(n == 0 || x == 0) {
            return 1;
        }

        return x * potencia(x, n-1);
    }
}
