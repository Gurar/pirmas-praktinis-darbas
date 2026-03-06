package lt.viko.eif.jkozlovski.pirmas.praktinis.darbas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Value("${app.mode}")
    private String mode;
    @Autowired
    private ServerService serverService;

    @Autowired
    private ClientService clientService;

    @Override
    public void run(String... args) throws Exception {
        if ("client".equalsIgnoreCase(mode))
            clientService.clientStart();
        else
            serverService.startServer();
    }
}
