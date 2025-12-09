package app;

import model.Reserva;
import service.SistemaReservas;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        Reserva r1 = new Reserva(1, "Diana", "Dic 09/2025", 30);
        Reserva r2 = new Reserva(2, "María", "Dic 10/2025", 5);

        System.out.println("\n-- 1. LISTADO INICIAL DE RESERVAS -- ");
        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);
        sistema.listarReservas();

        System.out.println("\n-- 2. MODIFICACION INFORMACIÓN USANDO SETTER --");
        r2.setCliente("José");
        r1.setDuracionHoras(10);
        sistema.listarReservas();

        System.out.println("\n-- 3. CANTIDAD DE RESERVAS -- ");
        sistema.contarReservas();

        System.out.println("\n-- 4. ELIMINACIÓN DE RESERVA INEXISTENTE --" );
        try{
            sistema.eliminarReserva(8);
        }catch(IllegalArgumentException e){
            System.out.println("Esta reserva no existe, ingrese una reserva válida"+e.getMessage());
        }

        System.out.println("\n-- 5. ELIMINACIÓN DE RESERVA VALIDA --" );
        try{
            sistema.eliminarReserva(1);
        }catch(IllegalArgumentException e){
            System.out.println("Esta reserva no existe, ingrese una reserva válida");
        }

        System.out.println("\n -- NUEVO LISTADO Y CONTEO DE RESERVAS -- ");
        sistema.listarReservas();
        sistema.contarReservas();


    }
}