public class FabricaLuxo implements FabricaAbstrata {
    public FabricaLuxo(){}

    @Override
    public Sala criaSala() {
        return new SalaLuxo();
    }

    @Override
    public Cozinha criaCozinha() {
        return new CozinhaLuxo();
    }
}
