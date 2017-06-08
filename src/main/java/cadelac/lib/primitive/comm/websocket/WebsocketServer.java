package cadelac.lib.primitive.comm.websocket;

import org.glassfish.tyrus.server.Server;

public class WebsocketServer {
	
	public static void launch(
			final String host
			, final String port
			, final String path
			, final Class<?> config) {
		
		final Server server = new Server(
        		host, 
        		Integer.parseInt(port), 
        		path, 
        		null,
        		config);
		try {
			server.start();
		}
		catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
        }
	}

}
