package com.matheus.lista_duplamente_encadeada.doubly;

public class TestDoublyLinkedList {

		public static void main(String[] args) {
			DoublyLinkedList myList = new DoublyLinkedList();
			myList.insertTail("Ana");
			myList.insertTail("td bem!");
			myList.insertTail("S2");
			System.out.println(":" + myList.printList());	
		}

}
