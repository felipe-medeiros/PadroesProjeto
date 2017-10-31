package model;

import java.util.List;

public class Criterio01 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio01";

    @Override
    public Ficha puxa(List<Ficha> listnre,List<Ficha> listpre,List<Ficha> listnfe,List<Ficha> listpfe) {

        if (listnfe.size() == 0){
            Ficha ficha = listnre.get(0);
            listnre.remove(0);
            controle++;
            return ficha;
        }else if (listnre.size() == 0){
            Ficha ficha = listnfe.get(0);
            listnfe.remove(0);
            controle++;
            return ficha;
        }

        if(controle%4 == 0) {
            Ficha ficha = listnfe.get(0);
            listnfe.remove(0);
            controle++;
            return ficha;
        }
        else {
            Ficha ficha = listnre.get(0);
            listnre.remove(0);
            controle++;
            return ficha;
        }
    }

    public String getTipo(){
        return this.tipo;
    }
}
