package com.matheus.atividades.atividade4_5;

public class Fila {
    private NoDuplo cabeca;
    private NoDuplo cauda;

    public Fila() {
        cabeca = null;
        cauda = null;
    }

    public void enqueue(Pessoa pessoa) {
        NoDuplo link = new NoDuplo(pessoa);
        if(cabeca == null){
            cabeca = new NoDuplo(pessoa);
            cauda = cabeca;
        }
        else
        {
            NoDuplo aux = cauda;

            //Achei minha cabeça
            while (aux.prev != null) {
                aux = aux.next;
            }

            aux.prev = link;
            link.next = aux;
            cabeca = link;
        }
    }

    public void dequeue() {
        NoDuplo aux = cauda;
        cauda = aux.prev;
    }

    public String printList(){
        if(isEmpty()){
            return "Lista vazia\n";
        }
        String str = "Lista Encadeada: ";
        for (NoDuplo aux = cabeca; aux != null; aux = aux.next){
            str+= " "+ aux.data;
        }
        return str + "\n";
    }


    public boolean isEmpty() {
        return cabeca == null;
    }

    private class NoDuplo {
        public NoDuplo prev;
        public NoDuplo next;
        public Pessoa data;

        public NoDuplo(Pessoa data) {
            this.data = data;
            prev = null;
            next = null;
        }

        @Override
        public String toString() {
            return "NoDuplo{" +
                    "prev=" + prev +
                    ", next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

}
