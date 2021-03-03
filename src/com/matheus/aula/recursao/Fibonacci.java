package com.matheus.aula.recursao;

public class Fibonacci {

    public int fibonacciRecursivo(int n) {
        int fib;

        if(n <= 1){
            return 1;
        }

        fib = fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);

        return fib;
    }

    public int fibonacciNaoRecursivo(int n){
        int fib = 0;
        int a = 1;
        int b = 0;

        for(int i = 0; i < n; i++){
            fib = a + b;
            b = a;
            a = fib;
        }

        return fib;
    }
}
