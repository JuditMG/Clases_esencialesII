package eetac.upc.edu.dsa.Jmale.Threads;




/**
 * Similar al ejercicio 11.-
 *  pero en este caso usando synchronized gestionar el acceso a ultimaEscritura.
 * @aut
 *NO SURT!!!
 */

/*
public class Ejercicio11 {
	
	private int temporizador;
	private String id = new String();
	private String ultimaEscritura;

	public Ejercicio11(String idi, int temporizadori, String ue) {
		id = idi;
		temporizador = temporizadori;
		ultimaEscritura = ue;

	//	this.start();

	}

	public void run() {
		for (int i = 0; i < temporizador; temporizador--) {

			try {
				//this.sleep(1000);
				
				System.out.println("Cuenta atras" + id + " "+ (this.temporizador - i) + " " + ultimaEscritura);
				ultimaEscritura = id;

	}
			// catch (InterruptedException e) {
//
				//e.printStackTrace();
			//}

		}
		System.out.println("Ha acabado del temporizador " + id);
	}

	public static void main(String[] args) {
		String ultimaEscritura = new String();
		Ejercicio11 contador1 = new Ejercicio11("id1", 3,ultimaEscritura);															
		Ejercicio11 contador2 = new Ejercicio11("id2", 6,ultimaEscritura);
	

	}
}*/