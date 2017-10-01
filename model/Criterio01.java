package model;

import control.ListaFichas;

public class Criterio01 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio01";

    @Override
    public Ficha puxa(ListaFichas lista) {

        if((controle%4) == 0) {
            Ficha ficha = lista.getNfe().get(0);
            lista.removerFicha("nfe",ficha.getNumero());
            controle++;
            return ficha;
        }
        else {
            Ficha ficha = lista.getNre().get(0);
            lista.removerFicha("nre",ficha.getNumero());
            controle++;
            return ficha;
        }
    }

    public String getTipo(){
        return this.tipo;
    }
}
