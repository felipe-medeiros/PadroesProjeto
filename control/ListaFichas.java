package control;

import model.*;

import java.util.List;

public abstract class ListaFichas {

    private static List<Ficha> nfe;
    private static List<Ficha> pfe;
    private static List<Ficha> pre;
    private static List<Ficha> nre;
    private Criterio criterio = new Criterio01();
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

    public void removerFicha(String tipo, int numero) {

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

    public Ficha chamarProximo(){
        return criterio.puxa(this);
    }

    public void mudarCriterio (int i) {
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

    public List<Ficha> getNfe() {
        return nfe;
    }

    public List<Ficha> getPfe() {
        return pfe;
    }

    public List<Ficha> getPre() {
        return pre;
    }

    public List<Ficha> getNre() {
        return nre;
    }

    public Criterio getCriterio() {
        return this.criterio.getTipo();
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public String toString() {
        return "ListaFichas{" +
                "nfe=" + nfe +
                ", pfe=" + pfe +
                ", pre=" + pre +
                ", nre=" + nre +
                '}';
    }
}