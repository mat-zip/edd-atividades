package com.matheus.atividades.atividade4e5;

public class DoublyLink {
    public DoublyLink prev;
    public DoublyLink next;
    public Pessoa data;

    public  DoublyLink() {

    }

    public DoublyLink (Pessoa data){
        this.data = data;
        prev = null;
        next = null;
    }

    @Override
    public String toString() {
        return "DoublyLink{" +
                "prev=" + prev +
                ", next=" + next +
                ", data='" + data + '\'' +
                '}';
    }
}
