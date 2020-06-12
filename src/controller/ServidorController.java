/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.DataInputStream;
import java.net.Socket;

import cliente.Cliente;
import servidor.Servidor;

/**
 *
 * @author Laís
 */
public class ServidorController {

	public static void main(String[] args) {
		Servidor server = new Servidor(5000);
		server.rodarServer();
	}

	public void threadServidor(Socket socket, Cliente cliente) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("inicio");
					DataInputStream input = new DataInputStream(socket.getInputStream());

					while (input != null) {
						System.out.println(input);
					}

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		thread.start();
	}

}
