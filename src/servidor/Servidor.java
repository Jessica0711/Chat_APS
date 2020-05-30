package servidor;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import cliente.Cliente;
import controller.ClientListener;
import controller.ServerListener;
import controller.ServidorController;
import model.Mensagem;

/**
 *
 * @author Lais
 */
public class Servidor{
    
    private int porta;
    
    public Servidor(int porta){
        setPorta(porta);
    }
           
        public void rodarServer(){
            //String mensagemRecebida;

            try{
                ServerSocket soc = new ServerSocket (this.porta);

                while(true){
                    System.out.println("Aguardando conexão...");
                    Socket socket = soc.accept();
                    System.out.println("Cliente conectado...");
                    //System.out.println(clientes.size());
                    System.out.println(socket.getInetAddress().getHostAddress());
                    ServerListener serverListener = new ServerListener(socket);
                    //clientes.add(clientListener.getOutputStream());
                    new Thread(serverListener).start();
                }
            } catch (IOException ex){
                ex.printStackTrace();
            
            } catch (Exception e) {
                e.printStackTrace();
            }
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
    
   

