package listas_encadeadas;

public interface List {

    //01 - Inserir um elemento na i-ésima posição, desde que: 0 <= i <= n;
    void inserir(Object elemento);

    //02 - Remover o i-ésimo elemento, 0 <= i <= (n-1);
    void removeCabeca();

    //03 - Acessar o i-ésimo elemento, 0 <= i <= (n-1);
    Object acessar(int posicao);

    //04 - Alterar o i-ésimo elemento, 0 <= i <= (n-1);
    void subtituir(Object elemento, Object novoElemento);

    //05 - Retornar o número de elementos;
    int qtdDeElementos();

    //06 - Localizar determinado elemento;
    boolean busca(Object elemento);

    //07 - Excluir todos os elementos
    void excluirLista();

    //08 - Verificar se a lista está vazia
    public boolean estaVazia();
}
