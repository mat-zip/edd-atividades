package com.matheus.atividades.atividade4e5;

public class Queue {
    DoublyLink head;
    DoublyLink tail;
    boolean isReversed;

    public Queue(){
        head = new DoublyLink();
        tail = new DoublyLink();
        isReversed = false;
    }

    public void enqueue(Pessoa p){
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

    public void dequeue() {
        if (!(tail.prev == null)) {
            DoublyLink anteriorACauda = tail.prev;
            anteriorACauda.next = null;
            tail = anteriorACauda;
        } else {
            throw new RuntimeException("[ERRO] - Lista vazia, não é possível remover");
        }

    }

    public void reverseWhile() {
        DoublyLink link = null;
        DoublyLink previousHead = head;

        while (previousHead != null) {
            link = previousHead.prev;

            previousHead.prev = previousHead.next;

            previousHead.next = link;

            previousHead = previousHead.prev;

        }

        if (link != null) {
            head = link.prev;
        }
    }

    public void reverseFor() {
        DoublyLink link = null;
        DoublyLink previousHead;

        for(previousHead = head; previousHead != null; previousHead = previousHead.prev) {
            link = previousHead.prev;

            previousHead.prev = previousHead.next;

            previousHead.next = link;
        }

        if (link != null) {
            head = link.prev;
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

    public DoublyLink getHead() {
        return head;
    }
}
