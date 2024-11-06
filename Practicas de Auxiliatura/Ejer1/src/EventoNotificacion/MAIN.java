package EventoNotificacion;

public class MAIN {
    public static void main(String[] args) {
        Evento eventoLanzamiento = new Evento("Lanzamiento de Fuego");

        eventoLanzamiento.registrarNotificacion(mensaje -> 
            System.out.println("Notificación 1 recibida: " + mensaje));

        
        eventoLanzamiento.registrarNotificacion(mensaje -> 
            System.out.println("Notificación 2 recibida: " + mensaje));

        eventoLanzamiento.activar();
    }
}
