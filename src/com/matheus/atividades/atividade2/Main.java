package com.matheus.atividades.atividade2;

public class Main {
    public static void main(String[] args) {
        int[] valores = {5,8,4,2,3,10,9};

        Calculadora c = new Calculadora();
        c.criaVetor(5);

        c.addNumeroNoVetor(2);
        c.addNumeroNoVetor(6);
        c.addNumeroNoVetor(4);
        c.addNumeroNoVetor(2);
        c.addNumeroNoVetor(5);

        System.out.println(c.soma());



    }
}
