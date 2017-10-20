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
    private Cidade cidade;
    private String nome;
    private String endereco;
    private Double distancia;
    private List<Quarto> quartos = new ArrayList<>();
    private Map<Tipo,Double> valores = new HashMap<>();

    public Hotel(Cidade cidade,String nome,String endereco,Double distancia){
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.distancia = distancia;
    }

    public Date formataData(String strdata) throws Exception{
        Date data;
        SimpleDateFormat dataFmt = new SimpleDateFormat("dd/MM/yyy");
        data = dataFmt.parse(strdata);
        return data;
    }

    public Boolean fazerReserva(int tipo,String strentrada,String strsaida)
        throws Exception{

        List<Quarto> quartos_tipo = new ArrayList();
        for(Quarto q: this.quartos){
            if(tipo == q.getTipo().valorTipo)
                quartos_tipo.add(q);
        }

        Date entrada,saida;
        entrada = formataData(strentrada);
        saida = formataData(strsaida);

        for (Quarto q: quartos_tipo){
            if (q.getReservas().isEmpty()){
                Reserva nova = new Reserva(++idreserva, entrada, saida, quartos_tipo.get(0));
                q.reservas.add(nova);
                return true;
            } else {
                for (Reserva r: q.getReservas()){
                    int x = entrada.compareTo(r.getSaida());
                    int y = saida.compareTo(r.getEntrada());
                    int z = entrada.compareTo(r.getEntrada());
                    int w = saida.compareTo(r.getSaida());

                    if((z < 0 && y <= 0) || (x >= 0)){
                        Reserva nova = new Reserva(++idreserva, entrada, saida, quartos_tipo.get(0));
                        q.adicionarReserva(nova);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void definirValores(Double inicial){
        valores.put(Tipo.SIMPLES,inicial);
        valores.put(Tipo.DUPLO,inicial*1.20);
        valores.put(Tipo.TRIPLO,inicial*1.50);
        valores.put(Tipo.PRESIDENCIAL,inicial*2);
    }

    public void criarQuarto(int id){
        switch (id){
            case 1:
                Quarto quarto1 = new Quarto(++idquarto,Tipo.SIMPLES);
                quartos.add(quarto1);
            break;
            case 2:
                Quarto quarto2 = new Quarto(++idquarto,Tipo.DUPLO);
                quartos.add(quarto2);
            break;
            case 3:
                Quarto quarto3 = new Quarto(++idquarto,Tipo.TRIPLO);
                quartos.add(quarto3);
            break;
            case 4:
                Quarto quarto4 = new Quarto(++idquarto,Tipo.PRESIDENCIAL);
                quartos.add(quarto4);
            break;
            default:
                Quarto quarto5 = new Quarto(++idquarto,Tipo.SIMPLES);
                quartos.add(quarto5);
        }
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public Map<Tipo, Double> getValores() {
        return valores;
    }

    public void setValores(Map<Tipo, Double> valores) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cidade=" + cidade +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", distancia=" + distancia +
                ", quartos=" + quartos +
                '}';
    }
}
