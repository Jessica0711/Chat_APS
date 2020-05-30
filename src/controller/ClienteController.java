/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.io.*;
import java.net.Socket;

import dao.MensagensDao;
import model.Arquivo;
import model.Mensagem;
import view.Chat;
import view.Inicio;

import javax.sound.midi.Soundbank;

/**
 *
 * @author Lais
 */
public class ClienteController {

	private Socket socket;
	private Chat chat;

	public static void main(String[] args) {

		Inicio inicio = new Inicio();
		inicio.setVisible(true);

	}

	public void iniciarConexao(Chat chat) {
		try {
			socket = new Socket("127.0.0.1", 5000);
		} catch (IOException exp) {
			showMessageDialog(null, "Servidor não conectado", "", ERROR_MESSAGE);
			System.exit(0);
		}
		setChat(chat);
		try{
			getChat().setSocket(socket);
			ClientListener clientListener = new ClientListener(socket, chat);
			chat.setOut(clientListener.getOutputStream());
			new Thread(clientListener).start();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

		Thread();
	}

	private void Thread() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					chat.mensagens();
					System.out.println("mensagens");



				} catch (Exception ex) {
					showMessageDialog(null, "Erro na conexão com o servidor", "", ERROR_MESSAGE);
				}
			}

		});
		thread.start();
	}
	
	private Object getObjectFromByte(byte[] objectAsByte) {
		Object obj = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			bis = new ByteArrayInputStream(objectAsByte);
			ois = new ObjectInputStream(bis);
			obj = ois.readObject();

			bis.close();
			ois.close();

		} catch (ClassNotFoundException |IOException e) {
			e.printStackTrace();
		}
		return obj;
	}


	/**
	 * @return the chat
	 */
	public Chat getChat() {
		return chat;
	}

	/**
	 * @param chat the chat to set
	 */
	public void setChat(Chat chat) {
		this.chat = chat;
	}
}
