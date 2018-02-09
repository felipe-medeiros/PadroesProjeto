package br.edu.ifpb;

public class FiguraAdapter implements Figura{
	private IExterna externa;
	
	public FiguraAdapter(IExterna externa) {
		this.externa = externa;
	}

	@Override
	public Double perimetro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return this.externa.area();
	}

	@Override
	public String desenha() {
		// TODO Auto-generated method stub
		return this.externa.desenharFigura();
	}
	
}
