package br.edu.ifpb;

import java.util.ArrayList;
import java.util.List;

public class Triangulo implements Figura{
    protected List<Ponto> pontos = new ArrayList<Ponto>();
    protected List<Reta> retas = new ArrayList<Reta>();

    public Triangulo(){
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto();

        this.pontos.add(p1);
        this.pontos.add(p2);
        this.pontos.add(p3);
    }

    @Override
    public Double perimetro() {
		Double aux = 0.0;
		for (Reta reta : retas) {
			aux += reta.getComprimento();
		}
		return aux;
	}

    @Override
    public Double area() {
		Double sp = 0.0;
		sp = ((retas.get(0).getComprimento())+(retas.get(1).getComprimento())+(retas.get(2).getComprimento()))/2;
		Double aux;
		aux = sp*(sp-(retas.get(0).getComprimento()))*(sp-(retas.get(1).getComprimento()))*(sp-(retas.get(2).getComprimento()));
		return Math.sqrt(aux);
	}

    @Override
    public String desenha() {
		return "Triângulo desenhado.";
	}

	@Override
	public String toString() {
		return "Triangulo [pontos=" + pontos + ", retas=" + retas + "]";
	}
    
}
