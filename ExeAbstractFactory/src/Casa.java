public class Casa {
    private String tipo;
    private Sala sala;
    private Cozinha cozinha;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
