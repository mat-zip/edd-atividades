package com.matheus.provas.prova1;

public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }

    public void push(Integer elemento) {
        // Cria um nó e aloca ele na memória
        No aux = new No();

        // Verifica se a pilha está vazia, se estiver não adiciona nada
        if (aux == null) {
            System.out.print("\nNão há elementos na pilha");
            return;
        }

        // initialize data into temp data field
        aux.data = elemento;

        // put top reference into temp link
        aux.next = topo;

        // update top reference
        topo = aux;

    }

    /**
     *
     * @return se a lista está vazia
     */
    public boolean estaVazia() {
        return topo == null;
    }

    /**
     * @return o elemento no topo da pilha
     */
    public Integer peek() {
        if (!estaVazia()){
            return topo.data;
        } else {
            System.out.println("A pilha está vazia!");
            return -1;
        }
    }

    /**
     * Remove o último elemento da pilha
     * @return o elemento removido
     */
    public Integer pop() {

        //Verifica se há elementos na pilha
        if (topo == null) {
            System.out.println("Não há elementos na pilha");
            return -1;
        }

        No aux = topo;
        //Atualiza o topo da pilha para apontar para o próximo nó
        topo = (topo).next;

        return aux.data;
    }

    public class No {
        public No next;
        public Integer data;

        public No(Integer data) {
            this.data = data;
            next = null;
        }

        public No() {

        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
