package lt.viko.eif.jkozlovski.pirmas.praktinis.darbas.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@Component
public class ServerService {
    @Value("${socket.server.port}")
    private int port;
    public void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server start on port: " + port);
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

            }
        } catch (IOException e) {

        }
    }
}
