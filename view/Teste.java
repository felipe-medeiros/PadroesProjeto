package view;

import control.ListaFichas;

public class Teste {
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            ListaFichas.adicionarFicha("nre");
        }
        for(int i=0;i<5;i++){
            ListaFichas.adicionarFicha("nfe");
        }
        for(int i=0;i<5;i++){
            ListaFichas.adicionarFicha("pre");
        }
        for(int i=0;i<5;i++){
            ListaFichas.adicionarFicha("pfe");
        }

        System.out.println(ListaFichas.getCriterio());

        System.out.println(ListaFichas.chamarProximo().toString());
        System.out.println(ListaFichas.chamarProximo().toString());
        System.out.println(ListaFichas.chamarProximo().toString());
        System.out.println(ListaFichas.chamarProximo().toString());
        System.out.println(ListaFichas.chamarProximo().toString());

        ListaFichas.mudarCriterio(3);
        System.out.println(ListaFichas.getCriterio());
        System.out.println(ListaFichas.chamarProximo().toString());
        System.out.println(ListaFichas.chamarProximo().toString());
    }
}
