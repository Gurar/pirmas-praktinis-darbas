package lt.viko.eif.jkozlovski.pirmas.praktinis.darbas.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.Socket;

@Component
public class ClientService {
    @Value("${socket.server.port}")
    private int port;

    @Value("${host.name}")
    private String host;

    public void clientStart() {
        try {
            Socket socket = new Socket(host,port);

        } catch (IOException e) {

        }
    }
}
