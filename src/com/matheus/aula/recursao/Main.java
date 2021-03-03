package com.matheus.aula.recursao;

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacciRecursivo(5));
        System.out.println(f.fibonacciNaoRecursivo(5));
    }
}
