package br.edu.ifpb;

public class Circulo implements Figura {
    private Ponto ponto1;
    private Ponto ponto2;
    private Reta diametro;

    public Circulo(Double diametro){
        this.ponto1 = new Ponto();
        this.ponto2 = new Ponto();
        this.diametro = new Reta(diametro);
    }

    @Override
    public Double perimetro() {
        return 3.14*diametro.getComprimento();
    }

    @Override
    public Double area() {
        return 3.14*Math.pow((diametro.getComprimento())/2,2);
    }

    @Override
    public String desenha() {
        return "Círculo desenhado.";
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "ponto1=" + ponto1 +
                ", ponto2=" + ponto2 +
                ", diametro=" + diametro +
                '}';
    }
}
