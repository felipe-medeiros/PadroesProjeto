package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quarto {
    private int idreserva=0;
    private int id;
    private Tipo tipo;
    public List<Reserva> reservas = new ArrayList<>();

    public Quarto(int id,Tipo tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public Date formataData(String strdata) throws Exception{
        Date data;
        SimpleDateFormat dataFmt = new SimpleDateFormat("dd/MM/yyy");
        data = dataFmt.parse(strdata);
        return data;
    }

    public void criarReserva(Date entrada,Date saida){
        Reserva nova = new Reserva(++idreserva, entrada, saida, this);
        this.reservas.add(nova);
    }

    public Quarto verificaDisponibilidade(String strentrada,String strsaida)
        throws Exception{
        Date entrada,saida;
        entrada = formataData(strentrada);
        saida = formataData(strsaida);

        if (this.getReservas().isEmpty()){
            return this;
        } else {
            for (Reserva r: this.getReservas()){
                int x = entrada.compareTo(r.getSaida());
                int y = saida.compareTo(r.getEntrada());
                int z = entrada.compareTo(r.getEntrada());
                int w = saida.compareTo(r.getSaida());

                if((z < 0 && y <= 0) || (x >= 0))
                    return this;
            }
        }
        return null;
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
