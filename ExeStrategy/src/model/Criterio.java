package model;

import java.util.List;

public interface Criterio {
    public Ficha puxa (List<Ficha> listnre,List<Ficha> listpre,List<Ficha> listnfe,List<Ficha> listpfe);
    public String getTipo();
}
