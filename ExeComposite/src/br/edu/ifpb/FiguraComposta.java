package br.edu.ifpb;

import java.util.List;
import br.edu.ifpb.Figura;;

public class FiguraComposta implements Figura {
    private List<Figura> figuras;
    private String nome;

    public FiguraComposta(String nome, List<Figura> figuras){
        this.nome = nome;
        this.figuras = figuras;
    }

    @Override
    public Double perimetro() {
    	Double aux = 0.0;
        for (Figura figura : figuras) {
			aux += figura.perimetro();
		}
        return aux;
    }

    @Override
    public Double area() {
        Double aux = 0.0;
        for (Figura figura : figuras) {
			aux += figura.area();
		}
        return aux;
    }

    @Override
    public String desenha() {
        String aux = "";
        for (Figura figura : figuras) {
			aux += figura.desenha();
		}
        return aux;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
    	String texto = "";
    	for (Figura figura : figuras) {
			texto += figura.toString();
		}
        return texto;
    }
}
