package Thred1;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
	
		/*Enivo de nota Fiscal*/
		new Thread() {
			public void run() {
				 for(int pos = 0; pos <10; pos++) {
						
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					 
					 System.out.println("Envio de nota fiscal");
					 
					
				 }
				
				
				
				
			}
			
			
			
		}.start();
		
		/*Divisao das thread*/
		new Thread() {
			public void run() {
				 for(int pos = 0; pos <10; pos++) {
						
					 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					 
					 System.out.println("Envio de email");
					 
					
				 }
				
				
				
				
			}
			
			
			
		}.start();
		
	
        
		 System.out.println("FIM DO ENVIO");
		 JOptionPane.showMessageDialog(null,"Execultando para usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
		     			
		}
	};

}
