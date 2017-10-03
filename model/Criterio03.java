package model;

import java.util.List;

public class Criterio03 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio03";

    @Override
    public Ficha puxa(List<Ficha> listnre, List<Ficha> listpre, List<Ficha> listnfe, List<Ficha> listpfe) {

        if (listpre.size()==0 && listpfe.size()==0){
            Ficha ficha = listnre.get(0);
            listnre.remove(0);
            controle++;
            return ficha;
        }else if (listnre.size()==0 && listpfe.size()==0){
            Ficha ficha = listpre.get(0);
            listpre.remove(0);
            controle++;
            return ficha;
        }else if (listnre.size()==0 && listpre.size()==0){
            Ficha ficha = listpfe.get(0);
            listpfe.remove(0);
            controle++;
            return ficha;
        }

        if((controle%4) == 0) {
            Ficha ficha = listnre.get(0);
            listnre.remove(0);
            controle++;
            return ficha;
        }
        else if((controle%2) == 0 || (controle%3) == 0) {
            Ficha ficha = listpre.get(0);
            listpre.remove(0);
            controle++;
            return ficha;
        }
        else{
            Ficha ficha = listpfe.get(0);
            listpfe.remove(0);
            controle++;
            return ficha;
        }
    }

    public String getTipo(){
        return this.tipo;
    }
}
