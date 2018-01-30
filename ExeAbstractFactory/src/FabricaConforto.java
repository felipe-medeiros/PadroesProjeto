public class FabricaConforto implements FabricaAbstrata {
    public FabricaConforto(){}

    @Override
    public Sala criaSala() {
        return new SalaConforto();
    }

    @Override
    public Cozinha criaCozinha() {
        return new CozinhaConforto();
    }
}
