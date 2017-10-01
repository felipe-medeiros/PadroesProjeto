package model;

import control.ListaFichas;

public class Criterio02 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio02";

    @Override
    public Ficha puxa(ListaFichas lista) {

        if((controle%8) == 0 || (controle%7) == 0) {
            Ficha ficha = lista.getPfe().get(0);
            lista.removerFicha("pfe",ficha.getNumero());
            controle++;
            return ficha;
        }
        else if((controle%6) == 0 || (controle%5) == 0 || (controle%4) == 0) {
            Ficha ficha = lista.getPre().get(0);
            lista.removerFicha("pre",ficha.getNumero());
            controle++;
            return ficha;
        }
        else{
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
