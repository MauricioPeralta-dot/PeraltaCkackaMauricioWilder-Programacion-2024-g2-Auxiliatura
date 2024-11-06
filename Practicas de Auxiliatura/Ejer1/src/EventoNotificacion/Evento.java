package EventoNotificacion;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private List<Eventonotificacion> notificaciones;

      public Evento(String nombre) {
        this.nombre = nombre;
        this.notificaciones = new ArrayList<>();
    }

      public void registrarNotificacion(Eventonotificacion notificacion) {
        notificaciones.add(notificacion);
    }

      public void activar() {
        String mensaje = "Activando evento: " + nombre;
        for (Eventonotificacion notificacion : notificaciones) {
            notificacion.notificar(mensaje);
        }
    }
}