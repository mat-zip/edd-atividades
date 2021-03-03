package com.matheus.atividades.atividade1;

public class Dado {
    private int res[];


    public Dado() {
    }

    public void lancarDado(int vezes) {
        res = new int[vezes];

        for(int i = 0; i < vezes; i++) {
            res[i] = (int) Math.round(Math.random() * 6);
        }
    }

    public String imprimir() {
        String s = "[";

        for (int i = 0; i < res.length; i++){
            s += res[i];
            if (i == res.length -1){
                break;
            }
            s += ", ";
        }
        s += "]";

        return s;
    }

    public void ocorrencias() {
        int[] faces = new int[7];

        for (int i = 0; i < res.length; i++){
            faces[res[i]]++;
        }

        String s = "[";

        for (int i = 0; i < faces.length; i++){
            s += faces[i];
            if (i == faces.length -1){
                break;
            }
            s += ", ";
        }
        s += "]";

        System.out.println(s);
    }

    public int maior() {
        int maior = 0;

        for(int i = 0; i < res.length; i++) {

            if(res[i] > maior) {
                maior = res[i];
            }

        }
        return maior;
    }

    public int menor() {
        int menor = 999;

        for(int i = 0; i < res.length; i++) {

            if(res[i] < menor) {
                menor = res[i];
            }
        }
        return menor;
    }

}
