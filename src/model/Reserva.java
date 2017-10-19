package model;

import java.util.Date;

public class Reserva {
    private int id;
    private Date entrada;
    private Date saida;
    private Quarto quarto;

    public Reserva(int id,Date entrada,Date saida,Quarto quarto){
        this.entrada = entrada;
        this.id = id;
        this.quarto = quarto;
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}
