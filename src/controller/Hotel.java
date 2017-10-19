package controller;

import model.Cidade;
import model.Quarto;
import model.Reserva;
import model.Tipo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Hotel {
    private int idreserva=0;
    private int idquarto=0;
    private int idcidade=0;
    private Cidade cidade;
    private String nome;
    private String endereco;
    private Double distancia;
    private List<Quarto> quartos = new ArrayList<>();
    private Map<Tipo,Double> valores = new HashMap<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Hotel(Cidade cidade,String nome,String endereco,Double distancia){
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.distancia = distancia;
    }

    public Boolean fazerReserva(int i,String strentrada,String strsaida)
        throws Exception{

        List<Quarto> disponiveis = new ArrayList();
        for(Quarto q: quartos){
            if(i == q.getTipo().valorTipo)
                disponiveis.add(q);
        }

        Date entrada,saida;
        SimpleDateFormat entradaFmt = new SimpleDateFormat("dd/MM/yyy");
        SimpleDateFormat saidaFmt = new SimpleDateFormat("dd/MM/yyy");

        entrada = entradaFmt.parse(strentrada);
        saida = saidaFmt.parse(strsaida);

        for(Reserva r: reservas){
            int x = r.getSaida().compareTo(entrada);
            int y = r.getEntrada().compareTo(saida);

            if(x == -1 || y == -1){
                return false;
            }else if(disponiveis.size() > 0){
                Reserva nova = new Reserva(++idreserva,entrada,saida,disponiveis.get(0));
                return true;
            }
        }
        return false;
    }
}
