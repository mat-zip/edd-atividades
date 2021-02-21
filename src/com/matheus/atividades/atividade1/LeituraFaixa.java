package com.matheus.atividades.atividade1;
import java.util.Scanner;

public class LeituraFaixa {
    public LeituraFaixa() {}

    public int validaValor() {
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        if(valor < 1) {
            System.out.println("O valor está fora da faixa permitida");
            return -1;
        } else if(valor > 9) {
            System.out.println("O valor está fora da faixa permitida");
            return -1;
        }
        System.out.println("O valor está na faixa permitida");
        return valor;
    }
}
