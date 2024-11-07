package Thread;

import javax.swing.JOptionPane;

public class Threads {

	public static void main(String[] args) throws Exception {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		new Thread() {

			public void run() {
				for (int pos = 0; pos < 5; pos++) {
					System.out.println("Executando rotina envio de nota fiscal");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			};
		}.start();

		System.out.println("Chegou ao fim da Thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário: ");
	}

	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			for (int pos = 0; pos < 5; pos++) {
				System.out.println("Executando rotina envio de email: ");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};
}
