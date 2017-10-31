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

                    List<Quarto> q = Controller.quartosDisponiveis(h,tipo, entrada, saida);
                    System.out.println(h.toString());
                    Hotel hotel = h;
                    double preco = Controller.calculaPreco(h,q.get(0),entrada,saida);
                    System.out.println("Preço: "+preco);

                    System.out.println("Fazer reserva?(S/n)");
                    String resp = ler.nextLine();
                    if (!resp.equals("n"))
                        Controller.fazerReserva(h,tipo,entrada,saida);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
