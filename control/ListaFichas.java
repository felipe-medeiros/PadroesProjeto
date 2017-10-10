package control;

import model.*;

import java.util.ArrayList;
import java.util.List;

public abstract class ListaFichas {

    private static List<Ficha> nfe = new ArrayList<>();
    private static List<Ficha> pfe = new ArrayList<>();
    private static List<Ficha> pre = new ArrayList<>();
    private static List<Ficha> nre = new ArrayList<>();
    private static Criterio criterio = new Criterio01();
    private static int numero_ficha=0;

    public static void adicionarFicha(String tipo) {
        numero_ficha++;
        Ficha ficha = new Ficha(tipo,numero_ficha);
        switch (tipo) {
        case "nfe":
            nfe.add(ficha);
            break;
        case "pfe":
            pfe.add(ficha);
            break;
        case "pre":
            pre.add(ficha);
            break;
        case "nre":
            nre.add(ficha);
            break;
        }
    }

    public static void removerFicha(String tipo, int numero) {

        switch (tipo) {
        case "nfe":
            for (Ficha f: nfe){
                if(f.getNumero() == numero)
                    nfe.remove(f);
            }
        break;
        case "pfe":
            for (Ficha f: pfe){
                if(f.getNumero() == numero)
                    pfe.remove(f);
            }
        break;
        case "pre":
            for (Ficha f: pre){
                if(f.getNumero() == numero)
                    pre.remove(f);
            }
        break;
        case "nre":
            for (Ficha f: nre){
                if(f.getNumero() == numero)
                    nre.remove(f);
            }
        break;
        }
    }

    public static Ficha chamarProximo() {
        Ficha ficha = criterio.puxa(nre,pre,nfe,pfe);
//        if (ficha == null)
//            throw new Exception("Fila sem fichas, mude o critério.");
        return ficha;
    }

    public static void mudarCriterio (int i) {
        switch (i){
        case 1:
            criterio = new Criterio01();
            break;
        case 2:
            criterio = new Criterio02();
            break;
        case 3:
            criterio = new Criterio03();
            break;
        case 4:
            criterio = new Criterio04();
            break;
        }
    }

    public static List<Ficha> getNfe() {
        return nfe;
    }

    public static List<Ficha> getPfe() {
        return pfe;
    }

    public static List<Ficha> getPre() {
        return pre;
    }

    public static List<Ficha> getNre() {
        return nre;
    }

    public static String getCriterio() {
        return criterio.getTipo();
    }

    public static void setCriterio(Criterio novo_criterio) {
        criterio = novo_criterio;
    }

    public static String listaNre(){
        String texto = "";
        for(Ficha f: nre)
            texto += f.toString();
        return texto;
    }

    public static String listaNfe(){
        String texto = "";
        for(Ficha f: nfe)
            texto += f.toString();
        return texto;
    }

    public static String listaPre(){
        String texto = "";
        for(Ficha f: pre)
            texto += f.toString();
        return texto;
    }

    public static String listaPfe(){
        String texto = "";
        for(Ficha f: pfe)
            texto += f.toString();
        return texto;
    }
}