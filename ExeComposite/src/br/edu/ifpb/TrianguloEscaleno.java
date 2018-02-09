package br.edu.ifpb;

public class TrianguloEscaleno extends Triangulo {

    public TrianguloEscaleno(Double lado1, Double lado2, Double lado3){
        super();
        Reta r1 = new Reta(lado1);
        Reta r2 = new Reta(lado2);
        Reta r3 = new Reta(lado3);

        this.retas.add(r1);
        this.retas.add(r2);
        this.retas.add(r3);
    }

    @Override
    public Double perimetro() {
        return super.perimetro();
    }

    @Override
    public Double area() {
        return super.area();
    }

    @Override
    public String desenha() {
        return "Triângulo Escaleno desenhado";
    }

    @Override
    public String toString() {
        return "TrianguloEscaleno{" +
                "pontos=" + pontos +
                ", retas=" + retas +
                '}';
    }
}
