package service;

import model.Reserva;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SistemaReservas {
    private ArrayList<Reserva> reservas;

    public SistemaReservas() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }

    public void eliminarReserva(int id) {
        boolean existeReserva = false;

        for (int i =0; i< reservas.size(); i++) {
            if (reservas.get(i).getIdReserva() == id) {
                reservas.remove(i);
                existeReserva = true;
                System.out.println("Reserva eliminada exitosamente");
                break;
            }
        }
            if(!existeReserva){
            throw new IllegalArgumentException("El número de reserva ingresado no existe");

        }
    }

    public void listarReservas(){
        if (reservas.isEmpty()){
           throw new IllegalArgumentException("No hay reservas para mostrar");
        }
        for (Reserva r: reservas){
            System.out.println("\n Reserva No.: "+r.getIdReserva());
            System.out.println("Cliente: "+r.getCliente());
            System.out.println("Fecha: "+r.getFecha());
            System.out.println("Duración en horas: "+r.getDuracionHoras());
            System.out.println("----- FIN -----");
        }
    }

    public void contarReservas(){
        System.out.println("\n Total Reservas: "+reservas.size());
    }

}
