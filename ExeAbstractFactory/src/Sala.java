public abstract class Sala {
    protected String piso;
    protected String parede;
    protected String porta;
    protected String tinta;
    protected String metais;
    protected String loucas;

    @Override
    public String toString() {
        return "Sala{" +
                ", piso='" + piso + '\'' +
                ", parede='" + parede + '\'' +
                ", porta='" + porta + '\'' +
                ", tinta='" + tinta + '\'' +
                ", metais='" + metais + '\'' +
                ", loucas='" + loucas + '\'' +
                '}';
    }
}
