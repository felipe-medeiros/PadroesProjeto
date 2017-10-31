package model;

import com.sun.org.apache.regexp.internal.RE;
import model.Cidade;
import model.Quarto;
import model.Reserva;
import model.Tipo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Hotel {
    private int idquarto=0;
    private Cidade cidade;
    private String nome;
    private String endereco;
    private Double distancia;
    private List<Quarto> quartos1 = new ArrayList<>();
    private List<Quarto> quartos2 = new ArrayList<>();
    private List<Quarto> quartos3 = new ArrayList<>();
    private List<Quarto> quartos4 = new ArrayList<>();
    private Map<Tipo,Double> valores = new HashMap<>();

    public Hotel(Cidade cidade,String nome,String endereco,Double distancia){
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.distancia = distancia;
    }

    public Double calculaPreco(Quarto quarto,String strentrada,String strsaida){
        try{
            Date entrada,saida;
            entrada = formataData(strentrada);
            saida = formataData(strsaida);

            int i = saida.compareTo(entrada);
            double unit = valores.get(quarto.getTipo());

            return i*unit;
        }catch (Exception e){}
        return 0.0;
    }

    public Date formataData(String strdata) throws Exception{
        Date data;
        SimpleDateFormat dataFmt = new SimpleDateFormat("dd/MM/yyy");
        data = dataFmt.parse(strdata);
        return data;
    }

    public List<Quarto> quartosDisponiveis(int tipo,String strentrada,String strsaida)
        throws Exception{

        List<Quarto> quartos;
        switch (tipo){
            case 1:
                quartos = this.quartos1;
            break;
            case 2:
                quartos = this.quartos2;
            break;
            case 3:
                quartos = this.quartos2;
            break;
            case 4:
                quartos = this.quartos4;
            break;
            default:
                quartos = this.quartos1;
            break;
        }

        for (Quarto q: quartos){
            if (q.verificaDisponibilidade(strentrada,strsaida) == null)
                quartos.remove(q);
        }
        return quartos;
    }

    public void fazerReserva(int tipo,String strentrada,String strsaida){
        try {
            List<Quarto> quartos = quartosDisponiveis(tipo,strentrada,strsaida);
            Date entrada, saida;
            entrada = formataData(strentrada);
            saida = formataData(strsaida);
            quartos.get(0).criarReserva(entrada,saida);
        }catch (Exception e){}
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
                quartos1.add(quarto1);
            break;
            case 2:
                Quarto quarto2 = new Quarto(++idquarto,Tipo.DUPLO);
                quartos2.add(quarto2);
            break;
            case 3:
                Quarto quarto3 = new Quarto(++idquarto,Tipo.TRIPLO);
                quartos3.add(quarto3);
            break;
            case 4:
                Quarto quarto4 = new Quarto(++idquarto,Tipo.PRESIDENCIAL);
                quartos4.add(quarto4);
            break;
            default:
                Quarto quarto5 = new Quarto(++idquarto,Tipo.SIMPLES);
                quartos1.add(quarto5);
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
                '}';
    }
}
