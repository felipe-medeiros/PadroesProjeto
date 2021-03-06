package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private int id;
    private Date entrada;
    private Date saida;

    public Reserva(int id,Date entrada,Date saida){
        this.entrada = entrada;
        this.id = id;
        this.saida = saida;
    }

    public Date formataData(String strdata) throws Exception{
        Date data;
        SimpleDateFormat dataFmt = new SimpleDateFormat("dd/MM/yyy");
        data = dataFmt.parse(strdata);
        return data;
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
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }
}
