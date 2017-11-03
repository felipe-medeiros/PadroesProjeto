package model;

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
    private HashMap<Tipo,Double> valores = new HashMap<>();

    public Hotel(Cidade cidade,String nome,String endereco,Double distancia){
        this.cidade = cidade;
        this.nome = nome;
        this.endereco = endereco;
        this.distancia = distancia;
    }

    public void definirValores(Double inicial){
        valores.put(Tipo.SIMPLES,inicial);
        valores.put(Tipo.DUPLO,inicial*1.20);
        valores.put(Tipo.TRIPLO,inicial*1.50);
        valores.put(Tipo.PRESIDENCIAL,inicial*2);
    }

    public void criarQuarto(int tipo){
        switch (tipo){
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

    public List<Quarto> getQuartos1() {
        return quartos1;
    }

    public void setQuartos1(List<Quarto> quartos1) {
        this.quartos1 = quartos1;
    }

    public List<Quarto> getQuartos2() {
        return quartos2;
    }

    public void setQuartos2(List<Quarto> quartos2) {
        this.quartos2 = quartos2;
    }

    public List<Quarto> getQuartos3() {
        return quartos3;
    }

    public void setQuartos3(List<Quarto> quartos3) {
        this.quartos3 = quartos3;
    }

    public List<Quarto> getQuartos4() {
        return quartos4;
    }

    public void setQuartos4(List<Quarto> quartos4) {
        this.quartos4 = quartos4;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cidade=" + cidade +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", distancia=" + distancia +
                ", quartos=" + quartos1 +
//                ", quartos=" + quartos2 +
//                ", quartos=" + quartos3 +
//                ", quartos=" + quartos4 +
                '}';
    }
}
