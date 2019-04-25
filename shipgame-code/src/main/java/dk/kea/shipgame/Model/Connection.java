package dk.kea.shipgame.Model;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class Connection {

    private static ServerSocket serverSocket;
    private static InetAddress host;
    private static final int PORT = 5000;

    boolean isServer;

    public Connection(){


    }
    public boolean startServer(){
        System.out.println("Opening port..\n");

        try{
            serverSocket = new ServerSocket(PORT);
        }catch(IOException ioEx){
            System.out.println("Unable to attach to port!");
            return false;
        }
        return true;
    }
    public  boolean startClient(String ip){
        System.out.println("Connecting to host");
        try {
            host = InetAddress.getByName(ip);
        }catch(UnknownHostException uhEx){
            System.out.println("Host ID not found");
            return false;
        }
        return true;
    }

}
