public class Casa {
    private int tipo;
    private Sala sala;
    private Cozinha cozinha;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tipo=" + tipo +
                ", sala=" + sala +
                ", cozinha=" + cozinha +
                '}';
    }
}
