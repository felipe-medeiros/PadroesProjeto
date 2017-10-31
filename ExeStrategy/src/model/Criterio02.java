package model;

import java.util.List;

public class Criterio02 implements Criterio {
    private int controle = 1;
    private String tipo = "criterio02";

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

        if((controle%8) == 0 || (controle%7) == 0) {
            Ficha ficha = listpfe.get(0);
            listpfe.remove(0);
            controle++;
            return ficha;
        }
        else if((controle%6) == 0 || (controle%5) == 0 || (controle%4) == 0) {
            Ficha ficha = listpre.get(0);
            listpre.remove(0);
            controle++;
            return ficha;
        }
        else{
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
