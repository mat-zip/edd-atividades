package com.matheus.provas.prova2;

public class ClasseOrdenacao {

    /**
     * Ordena um vetor com base no algoritmo de ordenação BUBBLE SORT
     * @param vetor - vetor que irá ser ordenado
     * @return - retorna o vetor passado por parâmetro ordenado
     */
    public int[] bubbleSortDecrescente(int[] vetor) {
        int i , j , aux ;
        for( i =0; i < vetor.length ; i ++)
        {
            for( j =1; j <=( vetor . length ) -1; j ++)
            {
                if( vetor [j -1] < vetor [ j ])
                {
                    aux = vetor [ j ];
                    vetor [ j ] = vetor [j -1];
                    vetor [j -1] = aux ;
                }
            }
        }
        return vetor ;

    }

    /**
     * Ordena um vetor com base no algoritmo de ordenação BUBBLE SORT de forma recursiva
     * @param vetor - vetor que irá ser ordenado
     * @param n - número para o caso trivial
     * @return ?????
     */
    public int bubbleSortRecursivo(int[] vetor, int n) {
        if (n <= 1) {
            return 1;
        }

        return 0;
    }

    /**
     * Ordena um vetor com base no algoritmo de ordenação Selection Sort,
     * Este método faz o uso de outro método chamado getMin(v[], i, n) que
     * por sua vez retorna o índice do menor número naquela iteração
     *
     * @param vetor - vetor que irá ser ordenado
     * @return  - retorna o vetor passado por parâmetro ordenado
     */
    public int [] selectionSortSeparado (int [] vetor ) {
        int i  , eleito , posicao =0;

        for( i =0; i <=( vetor . length ) -2; i ++)
        {
            eleito = vetor [ i ];

            //Faço a chamada para o método que retorna a posição do menor elemento
            posicao = getMin(vetor, i, i+1);
            vetor [ i ] = vetor [ posicao ];
            vetor [ posicao ] = eleito ;

        }
        return vetor ;
    }

    /**
     *
     * @param v - vetor que irá ser iterado para que se ache o índice do menor número
     * @param i - posição do vetor que deve-se iniciar a iteração
     * @param n - índice do menor número
     * @return - retorna o índice do menor número dentro do vetor fornecido por parâmetro
     */
    public int getMin(int[] v, int i, int n) {
        for (int j = i; j < v.length; j++) {
            if (v[j] < v[n]) {
                n = j;
            }
        }
        return n;
    }

    /**
     * Ordena um vetor de Strings com base no algoritmo de ordenação Intersion Sort
     * @param vetor - vetor que irá ser ordenado
     * @return - retorna o vetor passado por parâmetro ordenado
     */
    public String[] insertionSortString (String[] vetor ) {
        String eleito;
        int i;
        int j;

        for ( i =1; i <=( vetor . length ) -1; i ++)
        {
            eleito = vetor [ i ];
            j =i -1;
            //Utilização do método compareTo() para comparação de Strings
            while (( j >=0) && (vetor[j].compareTo(eleito) > 0))
            {
                vetor [ j +1] = vetor [ j ];
                j = j -1;
            }
            vetor [ j +1] = eleito ;
        }
        return vetor ;
    }
}
