package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        Reserva r1 = new Reserva(1, "Diana", "Dic 09/2025", 30);
        Reserva r2 = new Reserva(2, "María", "Dic 10/2025", 5);


        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);
        sistema.listarReservas();

        r2.setCliente("José");
        r1.setDuracionHoras(10);
        sistema.listarReservas();

        sistema.contarReservas();

        try{
            sistema.eliminarReserva(8);
        }catch(IllegalArgumentException e){
            System.out.println("Esta reserva no existe, ingrese una reserva válida");
        }


        sistema.listarReservas();
        sistema.contarReservas();


    }
}