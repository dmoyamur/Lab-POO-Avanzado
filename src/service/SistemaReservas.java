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

        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdReserva() == id) {
                reservas.remove(i);
                existeReserva = true;
                System.out.println("Reserva No. "+id+" eliminada exitosamente");
                break;
            }
        }
        if (!existeReserva) {
            StringBuilder ids = new StringBuilder();
            for (Reserva r : reservas) {
                ids.append(r.getIdReserva()).append(" ");
            }
                throw new IllegalArgumentException("\nId de reserva válidos: " + ids);
            }
    }

    public void listarReservas(){
        for (Reserva r: reservas){
            System.out.println("\n Reserva No.: "+r.getIdReserva());
            System.out.println("Cliente: "+r.getCliente());
            System.out.println("Fecha: "+r.getFecha());
            System.out.println("Duración en horas: "+r.getDuracionHoras());
            System.out.println("----- FIN -----");
        }
    }

    public void contarReservas(){
        System.out.println("Total Reservas: "+reservas.size());
    }

}
