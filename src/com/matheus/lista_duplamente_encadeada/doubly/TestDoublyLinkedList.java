package com.matheus.lista_duplamente_encadeada.doubly;

public class TestDoublyLinkedList {

		public static void main(String[] args) {
			DoublyLinkedList myList = new DoublyLinkedList();
			myList.insertHead("Ana");
			myList.insertHead("td bem!");
			myList.insertHead("S2");
			System.out.println(":" + myList.printList());	
		}

}
