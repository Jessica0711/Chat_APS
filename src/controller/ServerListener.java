package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.net.Socket;
import java.util.ArrayList;

import model.Mensagem;

public class ServerListener implements Runnable {

	public static ArrayList<ObjectOutputStream> clientes = new ArrayList<>();
	private Socket socket;
	private ObjectInputStream inputStream;
	private ObjectOutputStream outputStream;

	public ServerListener(Socket socket) throws Exception {
		this.socket = socket;
		this.outputStream = new ObjectOutputStream(socket.getOutputStream());
		this.inputStream = new ObjectInputStream(socket.getInputStream());
		clientes.add(outputStream);
	}

	public ObjectOutputStream getOutputStream() {
		return outputStream;
	}

	@Override
	public void run() {
		System.out.println("run");
		Object recebido;
		Mensagem message = null;
		while (true) {
			try {
				while ((recebido = (Object) inputStream.readObject()) != null) {
					message = (Mensagem) recebido;
					System.out.println(message);
					enviarMensagem(message);
				}
			} catch (StreamCorruptedException e) {

			} catch (Exception e) {
				e.printStackTrace();
				break;
			}

		}

	}

	public static void enviarMensagem(Mensagem mensagem) {
		System.out.println(clientes.size());
		for (ObjectOutputStream cliente : clientes) {
			try {
				cliente.writeObject(mensagem);
				cliente.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
