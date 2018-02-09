package br.edu.ifpb;

public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(Double base, Double lado){
        super();
        Reta r = new Reta(base);
        Reta r1 = new Reta(lado);

        this.retas.add(r);
        this.retas.add(r1);
        this.retas.add(r1);
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
        return "Triângulo Isósceles desenhado";
    }

    @Override
    public String toString() {
        return "TrianguloIsosceles{" +
                "pontos=" + pontos +
                ", retas=" + retas +
                '}';
    }
}
