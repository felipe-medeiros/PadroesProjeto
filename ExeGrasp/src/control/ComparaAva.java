package control;

import model.Hotel;

import java.util.Comparator;

public class ComparaAva implements Comparator<Hotel>{
    public int compare(Hotel h1,Hotel h2){
        if (h1.getAvaliacao() < h2.getAvaliacao())
            return -1;
        else if (h1.getAvaliacao() > h2.getAvaliacao())
            return 1;
        else
            return 0;
    }
}
