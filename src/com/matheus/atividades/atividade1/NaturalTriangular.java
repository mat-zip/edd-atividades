package com.matheus.atividades.atividade1;

public class NaturalTriangular {
    public NaturalTriangular() {

    }

    public boolean isTriangular(int n) {
        if(n < 6) {
            return false;
        }

        for(int i = 1; i <= n/2; i++) {
            if(n == i * (i+1) * (i+2)) {
                System.out.println(i * (i+1) * (i+2));
                return true;
            }
        }

        return false;
    }

}
