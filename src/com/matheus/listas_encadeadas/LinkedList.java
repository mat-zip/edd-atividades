package com.matheus.listas_encadeadas;

public class LinkedList implements List{

    private Link cabeca;
    private Link cauda;

    public LinkedList() {
        cabeca = null;
        cauda = null;
    }

    @Override
    public void inserir(Object elemento) {
        if (estaVazia()) {
            cabeca = new Link(elemento);
            return;
        }

        cauda().next = new Link(elemento);

    }

    @Override
    public void removeCabeca() {
        //-- Carro -> Avião -> Moto

        cabeca = cabeca.next;
    }

    @Override
    public Object acessar(int posicao) {
        Link nodo = cabeca;
        /**
         * Faz o nodo.next e atribui ao nodo a quantidade de vezes passada na posicão
         */

        for(int i = 0; (i < posicao || i == 0); i++) {
            //Se encontrar o elemento retorne true
            nodo = nodo.next;
        }

        return nodo;
    }

    @Override
    public void subtituir(Object elemento, Object novoElemento) {
        for(Link nodo = cabeca; nodo != null; nodo = nodo.next) {
            if (elemento == nodo.data){
                nodo.data = novoElemento;
            }
        }
    }

    @Override
    public int qtdDeElementos() {
        int tamanho = 0;
        Link elementoAtual = cabeca;

        while (elementoAtual != null) {
            tamanho++;
            elementoAtual = elementoAtual.next;
        }

        return tamanho;
    }


    @Override
    public boolean busca(Object elemento) {
        /**
         * Cria um nó que recebe o "head"
         * Enquanto o próximo elemento da lista for != de null
         * Verifique o próximo elemento da lista (head.next)
         */

        for(Link nodo = cabeca; nodo != null; nodo = nodo.next) {
            //Se encontrar o elemento retorne true
            if(elemento == nodo.data) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void excluirLista() {

    }

    public String printList(){
        if(estaVazia()) return "Lista vazia\n";
        String str = "Lista Encadeada: ";
        for (Link nodo = cabeca; nodo != null; nodo = nodo.next)
            str+= " "+ nodo.data;
        return str + "\n";
    }

    @Override
    public boolean estaVazia() {
        return cabeca == null;
    }

    public Link cauda() {
        Link cauda = cabeca;

        while(cauda.next != null) {
            cauda = cauda.next;
        }

        return cauda;
    }

    public class Link {
        public Link next;
        public Object data;

        public Link(Object data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

}
