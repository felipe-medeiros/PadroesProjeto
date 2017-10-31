package view;

import model.Hotel;
import model.Cidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static int idcidade=0;
    public static List<Hotel> hoteis = new ArrayList<>();

    public static void main(String[] args){

        cadastrar();

        Scanner ler = new Scanner(System.in);
        String cidade,entrada,saida;
        double menor,maior;
        int tipo;

        hoteis(0).toString();

//        System.out.println("---- BuscOtel ----\n\n");
//        System.out.println("Cidade: ");
//        cidade = ler.nextLine();
//
//        System.out.println("Data Entrada: ");
//        entrada = ler.nextLine();
//
//        System.out.println("Data Saída: ");
//        saida = ler.nextLine();
//
//        System.out.println("Tipo Quarto: Simples(1), Duplo(2), Triplo(3), Presidencial(4)");
//        tipo = ler.nextInt();
//
//        System.out.println("Menor preço: ");
//        menor = ler.nextDouble();
//
//        System.out.println("Maior preço: ");
//        maior = ler.nextDouble();

        try{
            for(Hotel h: hoteis){
                //h.quartosDisponiveis(tipo,entrada,saida);
                    h.toString();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void cadastrar(){

        Cidade joaopessoa = new Cidade(++idcidade,"João Pessoa");
        Cidade recife = new Cidade(++idcidade,"Recife");
        Cidade maceio = new Cidade(++idcidade,"Maceió");
        Cidade natal= new Cidade(++idcidade,"Natal");

        Hotel hotelTambau = new Hotel(joaopessoa,"Hotel Tambaú","Praia de Tambaú",5.5);
        Hotel hotelXenius = new Hotel(recife,"Xenius","Boa Viagem",7.5);
        Hotel hotelPlazza = new Hotel(maceio,"Plazza","Centro",0.5);
        Hotel hotelPalace = new Hotel(natal,"Palace","Praia do Forte",4.5);

        hoteis.add(hotelPalace);
        hoteis.add(hotelPlazza);
        hoteis.add(hotelTambau);
        hoteis.add(hotelXenius);

        double i = 180;
        for(Hotel h: hoteis){
            h.definirValores(i);
            i *= 1.1;
        }

        for (Hotel h: hoteis){
            for (int j=0;j<10;j++){
                h.criarQuarto(j%3+1);
            }
        }
    }
}
