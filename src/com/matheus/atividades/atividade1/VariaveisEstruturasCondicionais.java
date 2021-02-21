package com.matheus.atividades.atividade1;

public class VariaveisEstruturasCondicionais {

    public VariaveisEstruturasCondicionais() {
    }

    public String ordenarCrescente(int a, int b, int c) {
        int aux;
        // a = 5 b = 4 c = 3
        // a = 3 b = 4 c = 5;

        // a = 4 b = 5 c = 3 aux = 4
        // a = 3 b = 4 c = 5


        // a = 2 b = 5  c = 4
        // a = 2 b = 4 c = 5
        //

        if(a > b && b > c) {
            aux = a;
            a = c;
            c = aux;
        } else if(b > a && a > c) {
            aux = a;
            a = c;
            c = b;
            b = aux;
        } else if( b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if(a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        return a + ", " + b + ", " + c;
    }
}
