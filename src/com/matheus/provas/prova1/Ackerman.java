package com.matheus.provas.prova1;

import java.util.Stack;

public class Ackerman {

    public int ackermanRecursiva(int m, int n) {
        //Caso trivial
        if (m == 0){
            return n + 1;
        }

        //Método geral (subproblema)
        if (m > 0 && n == 0){
            return ackermanRecursiva(m - 1, 1);
        }

        //Método geral (subproblema)
        if (m > 0 && n > 0){
            return ackermanRecursiva(m - 1, ackermanRecursiva(m, n-1));
        }

        return 0;
    }

    public Integer ackermanNaoRecursiva(int m, int n) {
        //Cria uma pilha para adicionar elementos
        Pilha s = new Pilha();

        //Adiciona o m na pilha
        s.push(m);

        while(!s.estaVazia()){  //Verifica se a pilha não está vazia
            //Remove o último elemento da pilha e o adiciona na variavel "m"
            m= s.pop();

            //Se algum parâmetro for "0" coloque adicone "m+1" em "n"
            if(m==0||n==0)
                n+=m+1;
            else{
                //Adicione m-1 na pilha
                s.push(--m);

                //Adicione m+1 na pilha
                s.push(++m);

                //Retire 1 de "n"
                n--;
            }
        }

        return n;
    }
}
