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
        String cidade,entrada,saida,consulta="",reserva="";
        double menor,maior;
        int tipo, reserint=0;

        do {
            System.out.println("---- BuscOtel ----\n\n");
            System.out.println("Cidade: ");
            //cidade = ler.nextLine();
            cidade = "recife";

            System.out.println("Data Entrada: ");
            //entrada = ler.nextLine();
            entrada = "01/02/2017";

            System.out.println("Data Saída: ");
            //saida = ler.nextLine();
            saida = "05/02/2017";

            System.out.println("Tipo Quarto: Simples(1), Duplo(2), Triplo(3), Presidencial(4)");
            //tipo = ler.nextInt();
            tipo = 1;

            System.out.println("Menor preço: ");
            //menor = ler.nextDouble();
            menor = 100;

            System.out.println("Maior preço: ");
            //maior = ler.nextDouble();
            maior = 400;

            List<Hotel> hoteislist = new ArrayList<>();
            List<Hotel> hoteis = Controller.obterHoteis(0);
            int num = 0;
            try{
                for(Hotel h: hoteis){
                    if(cidade.toUpperCase().equals(h.getCidade().getNome().toUpperCase())) {

                        hoteislist.add(h);
                        Quarto q = Controller.quartoDisponivel(h,tipo, entrada, saida);
                        double preco = Controller.calculaPreco(h,q,entrada,saida);

                        if (preco >= menor && preco <= maior) {
                            System.out.println((++num)+": "+h.toString());
                            System.out.println("Preço: " + preco);
                        }
                    }
                }
                System.out.println("Fazer reserva?");
                reserva = ler.nextLine();
                if (!reserva.equals("n")){
                    Controller.fazerReserva(hoteis.get(num-1),tipo,entrada,saida);
                    System.out.println(hoteis.get(num-1).toString());
                }
                System.out.println("Nova consulta?(s/n)");
                consulta = ler.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (consulta.equals("s") && reserva.equals("n"));
    }
}
