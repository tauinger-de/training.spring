package core.h2;

import org.h2.tools.Server;
import org.springframework.core.NestedExceptionUtils;

import java.sql.SQLException;

/**
 * Starts an H2 database, which accepts remote connections on port specified port (default 9092).
 */
public class H2Launcher {

    private Server server;

    private int port = 9092;

    public void setPort(int port) {
        this.port = port;
    }

    public void start() {
        System.out.println("Launching H2 TCP Server");
        try {
            server = Server.createTcpServer("-tcp", "-ifNotExists", "-tcpPort", String.valueOf(port)).start();
        } catch (SQLException e) {
            var rootCause = NestedExceptionUtils.getRootCause(e);
            if (rootCause != null && rootCause.getMessage().equals("Address already in use: bind")) {
                System.out.println("Server seems to be running already (maybe in some other context?)");
            } else {
                throw new IllegalStateException("Failed to launch H2 TCP server", e);
            }
        }
    }

    public void stop() {
        if (this.server != null) {
            System.out.println("Stopping H2 TCP Server");
            this.server.stop();
        }
    }

}
