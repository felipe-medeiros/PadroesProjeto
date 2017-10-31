package control;

import model.Hotel;

import java.util.Comparator;

import static model.Tipo.SIMPLES;

public class ComparaPreco implements Comparator<Hotel> {
    public int compare(Hotel h1,Hotel h2){
        if (h1.getValores().get(SIMPLES) < h2.getValores().get(SIMPLES))
            return -1;
        else if (h1.getValores().get(SIMPLES) < h2.getValores().get(SIMPLES))
            return 1;
        else
            return 0;
    }
}
