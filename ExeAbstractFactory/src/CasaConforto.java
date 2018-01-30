public class CasaConforto extends Casa {
    private SalaConforto sala;
    private CozinhaConforto cozinha;

    @Override
    public SalaConforto getSala() {
        return sala;
    }

    public void setSala(SalaConforto sala) {
        this.sala = sala;
    }

    @Override
    public CozinhaConforto getCozinha() {
        return cozinha;
    }

    public void setCozinha(CozinhaConforto cozinha) {
        this.cozinha = cozinha;
    }
}
