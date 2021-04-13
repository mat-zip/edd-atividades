package com.matheus.atividades.atividade3;

public interface Lista {

    //    b) Inserir um elemento (objeto) na lista;
    void inserir(Object elemento);

    //    c) Remover um elemento (objeto) na lista;
    void remover();

    //    d) Acessar um elemento (objeto) na lista;
    Object acessar(int posicao);

    //    e) Alterar um elemento (objeto) na lista;
    void alterar(Object elemento, Object novoElemento);

    //    f) Retornar o número de elementos da lista;
    int qtdDeElementos();

    //    g) Localizar determinado elemento;
    boolean busca(Object elemento);

    boolean estaVazia();
}
