package br.edu.ifpb;

public class Losango implements IExterna{
	private Quadrado base;
	private Reta lado;
	
	public Losango(IExterna base, Double lado) {
		this.base = (Quadrado) base;
		this.lado = new Reta(lado);
	}
	
	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String desenharFigura() {
		// TODO Auto-generated method stub
		return "Losango desenhado";
	}
}
