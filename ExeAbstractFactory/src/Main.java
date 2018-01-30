public class Main {

    public static void main(String[] args) {
        FabricaAbstrata fb = new FabricaBasico();
        Sala s = fb.criaSala();
        //System.out.println(s.toString());

        FabricaAbstrata fb3 = new FabricaBasico();
        Cozinha c = fb3.criaCozinha();
        //System.out.println(c.toString());

        FabricaAbstrata fb2 = new FabricaConforto();
        Sala s1 = fb2.criaSala();
        //System.out.println(s1.toString());

        System.out.println(new CasaBuilder("Básica").cozinha(c).sala(s).criar());
        System.out.println(new CasaBuilder("Conforto").sala(s1).criar());

    }
}
