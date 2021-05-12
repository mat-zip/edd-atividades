package com.matheus.lista_duplamente_encadeada.doubly;

public class DoublyLink {
	public DoublyLink prev; 
	public DoublyLink next; 
    public String data;
    
    public DoublyLink (String data){
    	this.data = data; 
    	prev = null;
    	next = null;
    }
    @Override
    public String toString() {
        return data.toString();
    }
}
