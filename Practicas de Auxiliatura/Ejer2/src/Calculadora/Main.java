package Calculadora;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice", 100);

        jugador1.aplicarBonificacion(puntosBase -> (int)(puntosBase * 0.5));
        jugador1.mostrarEstado();  

        jugador1.aplicarBonificacion(puntosBase -> 30);
        jugador1.mostrarEstado();  

        jugador1.aplicarBonificacion(puntosBase -> puntosBase * 2);
        jugador1.mostrarEstado();  
    }
}
