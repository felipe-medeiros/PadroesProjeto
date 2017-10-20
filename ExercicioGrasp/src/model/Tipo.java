package model;

public enum Tipo {
    SIMPLES(1), DUPLO(2), TRIPLO(3), PRESIDENCIAL(4);

    public int valorTipo;

    Tipo(int valor){
        valorTipo = valor;
    }

    public Tipo getTipo(int id){
        for(Tipo tipo: Tipo.values()){
            if(tipo.getValorTipo() == id)
                return tipo;
        }
        return null;
    }

    public int getValorTipo() {
        return valorTipo;
    }

    public void setValorTipo(int valorTipo) {
        this.valorTipo = valorTipo;
    }
}
