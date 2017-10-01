package model;

import control.ListaFichas;

public class Criterio04 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio04";

    @Override
    public Ficha puxa(ListaFichas lista) {

        if((controle%2) == 0) {
            Ficha ficha = lista.getPfe().get(0);
            lista.removerFicha("pfe",ficha.getNumero());
            controle++;
            return ficha;
        }
        else{
            Ficha ficha = lista.getPre().get(0);
            lista.removerFicha("pre",ficha.getNumero());
            controle++;
            return ficha;
        }
    }

    public String getTipo(){
        return this.tipo;
    }
}
