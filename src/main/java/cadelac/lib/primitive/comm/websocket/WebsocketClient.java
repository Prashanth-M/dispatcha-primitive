package cadelac.lib.primitive.comm.websocket;

import java.net.URI;
import java.util.concurrent.CountDownLatch;

import org.glassfish.tyrus.client.ClientManager;

public class WebsocketClient {

    public static void connect(
    		final String host
    		, final String port
    		, final String path
    		, final String serverEndpoint
    		, final Class<?> config) {

    		CountDownLatch _latch = new CountDownLatch(1);
    	
        // create client that will talk to server
        ClientManager client = ClientManager.createClient();
        try {
        		final String uri = "ws://"+ host +":" + port + path + serverEndpoint;
            // start the client that will talk to server
            client.connectToServer(config, new URI(uri));
            _latch.await();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
        }
    }
}
