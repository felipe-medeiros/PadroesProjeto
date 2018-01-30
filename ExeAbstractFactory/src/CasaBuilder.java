public class CasaBuilder implements Builder<CasaBuilder, Casa> {
    private final String tipo;
    private Sala sala;
    private Cozinha cozinha;

    public CasaBuilder(String tipo){
        this.tipo = tipo;
    }

    @Override
    public CasaBuilder sala(Sala sala) {
        this.sala = sala;
        return this;
    }

    @Override
    public CasaBuilder cozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
        return this;
    }

    @Override
    public Casa criar() {
        Casa c = new Casa();
        c.setCozinha(this.cozinha);
        c.setSala(this.sala);
        c.setTipo(this.tipo);
        return c;
    }
}
