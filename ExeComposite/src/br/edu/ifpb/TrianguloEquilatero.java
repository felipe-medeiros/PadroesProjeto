package br.edu.ifpb;

public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(Double lado){
        super();
        Reta r = new Reta(lado);

        this.retas.add(r);
        this.retas.add(r);
        this.retas.add(r);
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
        return "Triângulo Equilátero desenhado.";
    }

    @Override
    public String toString() {
        return "TrianguloEquilatero{" +
                "pontos=" + pontos +
                ", retas=" + retas +
                '}';
    }
}
