package model;

public class Boleto implements Pagamento {
    @Override
    public Boolean pagar(Double valor) {
        return true;
    }
}
