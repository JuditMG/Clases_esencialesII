package eetac.upc.edu.dsa.Jmale.Threads;

public class CuentaAtras extends Thread {


	String id = new String();
	
	
	int temporizador;
	
	public CuentaAtras (String idi, int temporizadori)
	{
		
	
		//String id = new String();
		id= idi;
		temporizador = temporizadori;
	

		this.start();
		
	}
 
	
	public void run() {
        for ( int i=0; i<temporizador; temporizador--){
        	//Pause for 1s
        	try {
				this.sleep(1000);
				
				System.out.println("Cuenta atras:" + id+ " " +( this.temporizador-i));
				
				

			}  catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }
        	

        		   }
        System.out.println("Ha acabado del temporizador " + id);
	}
        			   
        	  
        	 
        		  
                                                  
                       

	
    public static void main(String[] args) {
    
        CuentaAtras contador1= new CuentaAtras("id1",4);
        CuentaAtras contador2= new CuentaAtras("id2",7);
        CuentaAtras contador3= new CuentaAtras("id3",8);
        
     
       
      }  
	

}

