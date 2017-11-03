package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quarto {
    private int id;
    private Tipo tipo;
    private List<Reserva> reservas = new ArrayList<>();

    public Quarto(int id,Tipo tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", reservas=" + reservas +
                '}';
    }
}
