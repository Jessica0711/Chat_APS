package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import controller.ServerListener;


/**
 *
 * @author Lais
 */
public class Servidor {
	

	private int porta;

	public Servidor(int porta) {
		setPorta(porta);
	}

	public void rodarServer() {
		// String mensagemRecebida;

		try {
			ServerSocket soc = new ServerSocket(this.porta);

			while (true) {
				System.out.println("Aguardando conexão...");
				Socket socket = soc.accept();
				System.out.println("Cliente conectado...");
				System.out.println(socket.getInetAddress().getHostAddress());
				ServerListener serverListener = new ServerListener(socket);
				new Thread(serverListener).start();
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		System.exit(0);
	}
	
	/**
	 * @return the porta
	 */
	public int getPorta() {
		return porta;
	}

	/**
	 * @param porta the porta to set
	 */
	public void setPorta(int porta) {
		this.porta = porta;
	}
}
