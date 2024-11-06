package Calculadora;

public class Jugador {
	private String nombre;
	private int puntos;

	    
	    public Jugador(String nombre, int puntos) {
	        this.nombre = nombre;
	        this.puntos = puntos;
	    }
        public void aplicarBonificacion(CalculadoraBonificacion calculadora) {
	        puntos += calculadora.calcular(puntos);
	    }
        public void mostrarEstado() {
	        System.out.println("Jugador: " + nombre + ", Puntos: " + puntos);
	    }
	}

