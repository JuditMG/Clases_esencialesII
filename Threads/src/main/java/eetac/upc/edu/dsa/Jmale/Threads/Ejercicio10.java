package eetac.upc.edu.dsa.Jmale.Threads;



public class Ejercicio10 extends Thread {

	private int temporizador;
	private String id = new String();
	private String ultimaEscritura;

	public Ejercicio10(String idi, int temporizadori, String ue) {
		id = idi;
		temporizador = temporizadori;
		ultimaEscritura = ue;

		this.start();

	}

	public void run() {
		for (int i = 0; i < temporizador; temporizador--) {

			try {
				this.sleep(1000);
				
				System.out.println("Cuenta atras" + id + " "+ (this.temporizador - i) + " " + ultimaEscritura);
				ultimaEscritura = id;

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println("Ha acabado del temporizador " + id);
	}

	public static void main(String[] args) {
		String ultimaEscritura = new String();
		Ejercicio10 contador1 = new Ejercicio10("id1", 3,ultimaEscritura);															
		Ejercicio10 contador2 = new Ejercicio10("id2", 6,ultimaEscritura);
	

	}
}