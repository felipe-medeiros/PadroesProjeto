package br.edu.ifpb;

public class Quadrado implements IExterna{
	private Reta lado;

	public Quadrado(Double lado) {
		this.lado = new Reta(lado);
	}
	
	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		return (lado.getComprimento()*lado.getComprimento()*lado.getComprimento());
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return (lado.getComprimento()*lado.getComprimento());
	}

	@Override
	public String desenharFigura() {
		// TODO Auto-generated method stub
		return "Quadrado desenhado.";
	}

	public Reta getLado() {
		return lado;
	}

	public void setLado(Reta lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}
}
