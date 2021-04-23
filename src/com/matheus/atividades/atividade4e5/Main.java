package com.matheus.atividades.atividade4e5;

public class Main {
    public static void main(String[] args) {
        Queue fila = new Queue();
        fila.insertHead(new Pessoa("Jenifer", 23));
        fila.insertHead(new Pessoa("Ricardo", 350));
        fila.insertHead(new Pessoa("Dino", 24));
        fila.insertHead(new Pessoa("Alle", 427));

        System.out.println(fila.printQueue());

    }
}
