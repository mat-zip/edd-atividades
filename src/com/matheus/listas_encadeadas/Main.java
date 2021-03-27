package listas_encadeadas;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        Product p = new Product(1, "Disco Rígido", 500, "Eletrônicos");
        Product p2 = new Product(2, "Memória Ram", 250, "Eletrônicos");
        Product p3 = new Product(3, "Teclado", 100, "Periféricos");
        Product p4 = new Product(4, "Mouse", 60, "Periféricos");

        myList.inserir(p);
        myList.inserir(p2);
        myList.inserir(p3);
        myList.inserir(p4);

        System.out.println(myList.printList());
    }
}
