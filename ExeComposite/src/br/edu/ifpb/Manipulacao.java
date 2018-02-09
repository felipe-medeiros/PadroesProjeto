package br.edu.ifpb;

import java.util.ArrayList;
import java.util.List;

public class Manipulacao {

    public static void main(String[] args) {
    
	    Figura circulo = new Circulo(3.0);
	    Figura trianguloEqui = new TrianguloEquilatero(3.0);
	    List<Figura> figs = new ArrayList<Figura>();
	    List<Figura> figs2 = new ArrayList<Figura>();
	    figs.add(circulo);
	    figs.add(trianguloEqui);
	    Figura composta = new FiguraComposta("triangulo redondo",figs);
	    figs2.add(composta);
	    figs2.add(composta);
	    Figura composta2 = new FiguraComposta("triangulo redondo2",figs2);
	    
	    IExterna externa = new Quadrado(4.0);
	    Figura adap = new FiguraAdapter(externa); 
	    
	    System.out.println(circulo.desenha());
	    System.out.println(circulo.perimetro());
	    System.out.println(circulo.area());
	    System.out.println(trianguloEqui.desenha());
	    System.out.println(trianguloEqui.perimetro());
	    System.out.println(trianguloEqui.area());
	    System.out.println(composta.desenha());
	    System.out.println(composta.perimetro());
	    System.out.println(composta.area());
	    System.out.println(composta2.desenha());
	    System.out.println(composta2.perimetro());
	    System.out.println(composta2.area());
	    
	    System.out.println(adap.desenha());
	    System.out.println(adap.area());
    }
}
