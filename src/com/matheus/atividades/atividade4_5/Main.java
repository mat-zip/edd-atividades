package com.matheus.atividades.atividade4_5;

public class Main {
    public static void main(String[] args) {
        Fila f = new Fila();
        f.enqueue(new Pessoa("Matheus", 19));
        f.enqueue(new Pessoa("Luiz", 20));
        f.enqueue(new Pessoa("Jeff", 19));
        System.out.println(f.printList());
        f.dequeue();
        System.out.println(f.printList());

    }
}
