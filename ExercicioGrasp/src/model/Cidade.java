package model;

public class Cidade {
    private int id;
    private String nome;

    public Cidade(int id,String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
