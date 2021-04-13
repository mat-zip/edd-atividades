package com.matheus.atividades.atividade3;

public class LinkedList implements Lista{
    private Link cabeca;
    private Link cauda;

    public LinkedList() {
        cabeca = null;
        cauda = null;
    }

    @Override
    public void inserir(Object elemento) {
        if (estaVazia()) {
            cabeca = new Link(elemento); //Coloca o elemento no inicio da lista
            return;
        }

        cauda().next = new Link(elemento); //Adicionando o elemento no final da lista
    }

    @Override
    public void remover() {
        cabeca = cabeca.next;
    }

    @Override
    public Object acessar(int posicao) {
        Link no = cabeca;

        //Avião -> Carro -> Bicicleta -> Null
        //Carro -> Bicicleta -> Null
        //Bicicleta -> Null

        for (int i = 0; (i < posicao || i == 0); i++) {
            no = no.next;
        }

        return no;
    }

    @Override
    public void alterar(Object elemento, Object novoElemento) {
        for(Link no = cabeca; no != null; no = no.next) {
            if (elemento == no.data){
                no.data = novoElemento;
            }
        }
    }

    @Override
    public int qtdDeElementos() {
        return 0;
    }

    @Override
    public boolean busca(Object elemento) {
        return false;
    }

    @Override
    public boolean estaVazia() {
        return this.cabeca == null;
    }

    public Link cauda() {
        Link cauda = cabeca;

        //Avião -> Carro -> Bicicleta -> Null
        //Carro -> Bicicleta -> Null
        //Bicicleta -> Null

        while (cauda.next != null){
            cauda = cauda.next;
        }

        return cauda;
    }

    public class Link {
        public Link next;
        public Object data;

        public Link (Object data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
