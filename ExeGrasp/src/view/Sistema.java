package view;

import model.Hotel;
import model.Cidade;
import control.Controller;
import model.Quarto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static int idcidade=0;
    public static List<Hotel> hoteis = new ArrayList<>();

    public static void main(String[] args){

        Controller.cadastrar();

        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        String cidade,entrada,saida;
        double menor,maior;
        int tipo;

        System.out.println("---- BuscOtel ----\n\n");
        System.out.println("Cidade: ");
        cidade = ler.nextLine();

        System.out.println("Data Entrada: ");
        entrada = ler.nextLine();

        System.out.println("Data Saída: ");
        saida = ler.nextLine();

        System.out.println("Tipo Quarto: Simples(1), Duplo(2), Triplo(3), Presidencial(4)");
        tipo = ler.nextInt();

        System.out.println("Menor preço: ");
        menor = ler.nextDouble();

        System.out.println("Maior preço: ");
        maior = ler.nextDouble();

        List<Hotel> hoteis = Controller.obterHoteis();
        try{
            for(Hotel h: hoteis){
                if(cidade.toUpperCase().equals(h.getCidade().getNome().toUpperCase())) {

                    System.out.println(h.toString());
                    Quarto q = Controller.quartoDisponivel(h,tipo, entrada, saida);


                    double preco = Controller.calculaPreco(h,q,entrada,saida);
                    System.out.println("Preço: "+preco);

                    Boolean v = Controller.fazerReserva(h,tipo,entrada,saida);
                    System.out.println(v);
                    h.toString();
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
