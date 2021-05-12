package com.matheus.atividades.atividade4e5;

public class Main {
    public static void main(String[] args) {
        Queue fila = new Queue();
        fila.enqueue(new Pessoa("Jenifer", 23));
        fila.enqueue(new Pessoa("Luiz", 350));
        fila.enqueue(new Pessoa( "Dino", 24));
        fila.enqueue(new Pessoa("Alle", 427));

        System.out.println(fila.printQueue());
        fila.reverseFor();
        System.out.println(fila.printQueue());
        fila.reverseFor();
        System.out.println(fila.printQueue());
        fila.reverseFor();
        System.out.println(fila.printQueue());
    }
}
