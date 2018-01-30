public class Main {

    public static void main(String[] args) {
        FabricaAbstrata fb = new FabricaBasico();
        Sala s = fb.criaSala();
        System.out.println(s.toString());

        FabricaAbstrata fb2 = new FabricaConforto();
        Sala s1 = fb2.criaSala();
        System.out.println(s1.toString());

        FabricaAbstrata fb3 = new FabricaBasico();
        Cozinha c = fb3.criaCozinha();
        System.out.println(c.toString());
    }
}
