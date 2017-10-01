package view;

import control.ListaFichas;
import model.Ficha;

public class Teste {
    public static void main(String[] args){
        ListaFichas Lf = new ListaFichas();

        for(int i=0;i<5;i++){
            Lf.adicionarFicha("nre");
        }
        for(int i=0;i<5;i++){
            Lf.adicionarFicha("nfe");
        }
        for(int i=0;i<5;i++){
            Lf.adicionarFicha("pre");
        }
        for(int i=0;i<5;i++){
            Lf.adicionarFicha("pfe");
        }

        Lf.toString();

    }
}
