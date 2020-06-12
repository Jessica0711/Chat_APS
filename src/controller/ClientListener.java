package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import model.Mensagem;
import view.Chat;

public class ClientListener implements Runnable {

    private Socket socket;
    private Chat chat;
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;

    public ClientListener(Socket socket, Chat chat) throws Exception {
        this.socket = socket;
        this.chat = chat;
        this.outputStream = new ObjectOutputStream(socket.getOutputStream());
        this.inputStream = new ObjectInputStream(socket.getInputStream());
    }

    public ObjectOutputStream getOutputStream() {
        return outputStream;
    }

    @Override
    public void run() {
        Mensagem message = null;
        while(true) {
            try {
                while ((message = (Mensagem) inputStream.readObject()) != null) {
                	System.out.println(message);
                    chat.mensagens();
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

        }

    }

}
