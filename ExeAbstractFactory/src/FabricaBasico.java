public class FabricaBasico implements FabricaAbstrata {
    public FabricaBasico(){}

    @Override
    public Sala criaSala() {
        return new SalaBasico();
    }

    @Override
    public Cozinha criaCozinha() {
        return new CozinhaBasico();
    }
}
