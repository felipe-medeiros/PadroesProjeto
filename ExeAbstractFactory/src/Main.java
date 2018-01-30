public class Main {

    public static void main(String[] args) {
        FabricaAbstrata fb = new FabricaBasico();
        Sala s = fb.criaSala();
        //System.out.println(s.toString());

        fb = new FabricaBasico();
        Cozinha c = fb.criaCozinha();
        //System.out.println(c.toString());

        fb = new FabricaConforto();
        Sala s1 = fb.criaSala();
        //System.out.println(s1.toString());

        System.out.println(new CasaBuilder(1).cozinha(c).sala(s).criar());
        System.out.println(new CasaBuilder(2).sala(s1).criar());
    }
}
