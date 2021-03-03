package com.matheus.atividades.atividade1;

public class Triangulo {
    private int ladoA,ladoB, ladoC;


    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public String classificacao() {
        if(isTriangulo()) {
            return "As medidas não formam um triângulo";
        }

        if(this.ladoA == this.ladoB && ladoB == this.ladoC) {
            return "Equilátero";
        } else if ((this.ladoA == this.ladoB && this.ladoA != this.ladoC) ||
                   (this.ladoB == this.ladoC && this.ladoB != this.ladoA) ||
                   (this.ladoA == this.ladoC && ladoA != this.ladoB)) {
            return "Isósceles";
        }
        return "Escaleno";
    }

    public boolean isTriangulo() {
        if(((this.ladoB - this.ladoC) < this.ladoA) ||
           ((this.ladoA - this.ladoC) < this.ladoB) ||
           ((this.ladoA - this.ladoB) < this.ladoC)) {
            return false;
        }
        return true;
    }
}
