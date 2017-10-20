package view;

import controller.Hotel;
import model.Cidade;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args){
        int idcidade=0;
        List<Hotel> hoteis = new ArrayList<>();

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

//        for (Hotel h: hoteis){
//            for (int j=0;j<10;j++){
//                h.criarQuarto(j%3+1);
//            }
//        }

        hotelTambau.criarQuarto(1);
        hotelTambau.criarQuarto(1);
        try{
            hotelTambau.fazerReserva(1,"02/02/2017","07/02/2017");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(hotelTambau.getQuartos().get(0).toString());
        System.out.println(hotelTambau.getQuartos().get(1).toString());
        try{
            hotelTambau.fazerReserva(1,"03/02/2017","06/02/2017");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(hotelTambau.getQuartos().get(0).toString());
        System.out.println(hotelTambau.getQuartos().get(1).toString());
    }
}
