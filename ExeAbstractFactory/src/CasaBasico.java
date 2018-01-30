public class CasaBasico extends Casa {
    private SalaBasico sala;
    private CozinhaBasico cozinha;

    @Override
    public SalaBasico getSala() {
        return sala;
    }

    public void setSala(SalaBasico sala) {
        this.sala = sala;
    }

    @Override
    public CozinhaBasico getCozinha() {
        return cozinha;
    }

    public void setCozinha(CozinhaBasico cozinha) {
        this.cozinha = cozinha;
    }
}
