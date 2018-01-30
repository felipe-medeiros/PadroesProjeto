public class CasaBuilder implements Builder<CasaBuilder, Casa> {
    private final int tipo;
    private Sala sala;
    private Cozinha cozinha;

    public CasaBuilder(int tipo){
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
        Casa c;
        switch (this.tipo){
            case 3:
                c = new CasaLuxo();
            break;
            case 2:
                c = new CasaConforto();
            break;
            case 1:
                c = new CasaBasico();
            break;
            default:
                c = null;
            break;
        }
        c.setTipo(this.tipo);
        c.setCozinha(this.cozinha);
        c.setSala(this.sala);
        return c;
    }
}
