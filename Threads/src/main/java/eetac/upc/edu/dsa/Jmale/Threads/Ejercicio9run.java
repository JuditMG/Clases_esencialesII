package eetac.upc.edu.dsa.Jmale.Threads;

public class Ejercicio9run implements Runnable {

	  private static int count = 0;
	 
	// private final int id = count++;
	 
	 private String id = new String();
		
		
		private int temporizador;
		
		public Ejercicio9run (String idi, int temporizadori)
		{
			
		
			//String id = new String();
			id= idi;
			temporizador = temporizadori;
		

			//this.start();
			
		}
	 
	 
	 public Ejercicio9run() {  
	  System.out.println("Inicio Temporizador Id: " + id);  
	 }
	 
	 public void run(){
	 
	 for ( int i=0; i<temporizador; temporizador--){
     	System.out.println("Cuenta atras:" + id+ " " +( this.temporizador-i));
     	

     		   }
	 
     System.out.println("Ha acabado del temporizador " + id);
	}
     			   
     	  
     	
	

public static void main(String[] args){
	 
	

    CuentaAtras contador1= new CuentaAtras("id1",4);
    CuentaAtras contador2= new CuentaAtras("id2",7);
    CuentaAtras contador3= new CuentaAtras("id3",8);
    
	 // for(int i = 0; i < 10; i++)
	   //new Thread(new Ejercicio9run()).start();  
	  
	 
	 }
	 
	}
