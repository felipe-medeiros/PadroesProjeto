package model;

import control.ListaFichas;

public interface Criterio {
    public Ficha puxa (ListaFichas lista);
    public String getTipo();
}
