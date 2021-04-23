package com.matheus.atividades.atividade4e5;

public class Queue {
    DoublyLink head;
    DoublyLink tail;

    public Queue(){
        head = null;
        tail = null;
    }

    public void insertHead(Pessoa p){
        DoublyLink link = new DoublyLink(p);
        if(head == null){
            head = link;
            tail = link;
        }
        else
        {
            DoublyLink aux = head;
            aux.prev = link;
            link.next = head;
            head = link;

        }
    }

    public void removeTail() {
        if (!(tail.prev == null)) {
            DoublyLink anteriorACauda = tail.prev;
            anteriorACauda.next = null;
            tail = anteriorACauda;
        } else {
            throw new RuntimeException("[ERRO] - Lista vazia, não é possível remover");
        }

    }


    public String printQueue(){
        if(isEmpty()) return "Lista vazia\n";
        String str = "Lista Encadeada: ";
        for (DoublyLink aux = head; aux != null; aux = aux.next)
            str+= " "+ aux.data;
        return str + "\n";
    }

    public int length() {
        int length = 0;
        DoublyLink current = head;
        while(current != null){
            length ++;
            current = current.next;
        }
        return length;
    }
    public boolean isEmpty(){

        return head == null;
    }
}
