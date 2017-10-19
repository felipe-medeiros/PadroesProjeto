package model;

public class Credito implements Pagamento {
    @Override
    public Boolean pagar(Double valor) {
        return true;
    }
}
