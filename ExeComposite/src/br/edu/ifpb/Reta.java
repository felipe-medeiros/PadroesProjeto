package br.edu.ifpb;

public class Reta {
    private Double comprimento;

    public Reta(Double comprimento){
        this.comprimento = comprimento;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

	@Override
	public String toString() {
		return "Reta [comprimento=" + comprimento + "]";
	}
}
