package control;

import model.Cidade;
import model.Hotel;
import model.Quarto;
import model.Reserva;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public abstract class Controller {
    public static int idcidade=0;
    public static List<Hotel> hoteis = new ArrayList<>();

    public static void cadastrar(){

        Cidade joaopessoa = new Cidade(++idcidade,"Joao Pessoa");
        Cidade recife = new Cidade(++idcidade,"Recife");
        Cidade maceio = new Cidade(++idcidade,"Maceio");
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

    public static Double calculaPreco(Hotel hotel,Quarto quarto,String strentrada,String strsaida){
        try{
            Date entrada,saida;
            entrada = formataData(strentrada);
            saida = formataData(strsaida);

            int i = saida.compareTo(entrada);
            double unit = hotel.getValores().get(quarto.getTipo());
            return Math.floor(i*unit);
        }catch (Exception e){}
        return 0.0;
    }

    public static void fazerReserva(Hotel hotel,int tipo,String strentrada,String strsaida){
        try {
            List<Quarto> quartos = quartosDisponiveis(hotel,tipo,strentrada,strsaida);
            Date entrada, saida;
            entrada = formataData(strentrada);
            saida = formataData(strsaida);
            quartos.get(0).criarReserva(entrada,saida);
        }catch (Exception e){}
    }

    public static Date formataData(String strdata) throws Exception{
        Date data;
        SimpleDateFormat dataFmt = new SimpleDateFormat("dd/MM/yyy");
        data = dataFmt.parse(strdata);
        return data;
    }

    public static List<Quarto> quartosDisponiveis(Hotel hotel,int tipo,String strentrada,String strsaida)
        throws Exception{
        List<Quarto> quartos;
        switch (tipo){
            case 1:
                quartos = hotel.getQuartos1();
                break;
            case 2:
                quartos = hotel.getQuartos2();
                break;
            case 3:
                quartos = hotel.getQuartos3();
                break;
            case 4:
                quartos = hotel.getQuartos4();
                break;
            default:
                quartos = hotel.getQuartos1();
                break;
        }

        for (Quarto q: quartos){
            if (verificaDisponibilidade(q,strentrada,strsaida) == null)
                quartos.remove(q);
        }
        return quartos;

    }

    public static Quarto verificaDisponibilidade(Quarto quarto,String strentrada,String strsaida)
        throws Exception{
        Date entrada,saida;
        entrada = formataData(strentrada);
        saida = formataData(strsaida);

        if (quarto.getReservas().isEmpty()){
            return quarto;
        } else {
            for (Reserva r: quarto.getReservas()){
                int x = entrada.compareTo(r.getSaida());
                int y = saida.compareTo(r.getEntrada());
                int z = entrada.compareTo(r.getEntrada());
                int w = saida.compareTo(r.getSaida());

                if((z < 0 && y <= 0) || (x >= 0))
                    return quarto;
            }
        }
        return null;
    }

    public static void ordenar(){
        List<Hotel> hotels = new ArrayList<>();
        Collections.sort(hotels,new ComparaDist());
    }

    public static List<Hotel> obterHoteis(){
        ordenar();
        return hoteis;
    }

}
