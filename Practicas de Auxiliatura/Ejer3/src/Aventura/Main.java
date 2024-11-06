package Aventura;

     public class Main {
	    public static void main(String[] args) {
	      Aventura aventura = new Aventura();

	        aventura.agregarTarea(() -> System.out.println("Recoger la espada mágica"));
	        aventura.agregarTarea(() -> System.out.println("Explorar la cueva misteriosa"));
	        aventura.agregarTarea(() -> System.out.println("Derrotar al dragón de fuego"));
	        aventura.agregarTarea(() -> System.out.println("Rescatar al prisionero en la torre"));

	        aventura.iniciar();
	    }
	}