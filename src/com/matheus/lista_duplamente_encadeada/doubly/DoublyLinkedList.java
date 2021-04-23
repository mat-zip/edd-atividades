package com.matheus.lista_duplamente_encadeada.doubly;

public class DoublyLinkedList {
	DoublyLink head; 
	DoublyLink tail;
    
    public DoublyLinkedList(){  
    	head = null;
    	tail = null;
    }
    
  public void insertHead(String elem){
	  DoublyLink link = new DoublyLink(elem);
      if(head == null){
          head = link;
      }
      else
      {
    	  DoublyLink aux = head;
          while(aux.next != null){
              aux = aux.next;
          } 
          aux.next  = link;
          link.prev = aux;

      }
    }
  
 
    public String printList(){
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
    public void replace(String elem, String newElem){
        for(DoublyLink aux = head; aux != null; aux = aux.next)   
        	if (elem == aux.data) 
        		aux.data = newElem;         
      }

}
