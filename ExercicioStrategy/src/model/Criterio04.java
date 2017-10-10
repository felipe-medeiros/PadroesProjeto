package model;

import java.util.List;

public class Criterio04 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio04";

    @Override
    public Ficha puxa(List<Ficha> listnre, List<Ficha> listpre, List<Ficha> listnfe, List<Ficha> listpfe) {

        if (listpfe.size() == 0){
            Ficha ficha = listpre.get(0);
            listnre.remove(0);
            controle++;
            return ficha;
        }else if (listpre.size() == 0){
            Ficha ficha = listpfe.get(0);
            listnfe.remove(0);
            controle++;
            return ficha;
        }

        if((controle%2) == 0) {
            Ficha ficha = listpfe.get(0);
            listpfe.remove(0);
            controle++;
            return ficha;
        }
        else{
            Ficha ficha = listpre.get(0);
            listpre.remove(0);
            controle++;
            return ficha;
        }
    }

    public String getTipo(){
        return this.tipo;
    }
}
