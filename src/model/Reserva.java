package model;

import java.util.Date;

public class Reserva {
    private int id;
    private Date entrada;
    private Date saida;

    public Reserva(int id,Date entrada,Date saida,Quarto quarto){
        this.entrada = entrada;
        this.id = id;
        this.saida = saida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }
}
