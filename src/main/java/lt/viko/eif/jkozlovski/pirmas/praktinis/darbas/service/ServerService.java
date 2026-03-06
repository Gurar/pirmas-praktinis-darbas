package lt.viko.eif.jkozlovski.pirmas.praktinis.darbas.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;

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

                byte[] xml = Files.readAllBytes(Path.of("student.xml"));

                OutputStream out = socket.getOutputStream();
                out.write(xml);
                out.flush();

                socket.close();

                System.out.println("XML file sent");
            }
        } catch (IOException e) {

        }
    }
}
