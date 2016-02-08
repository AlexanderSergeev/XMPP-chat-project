package chat;


import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;



public class Main {

	public static void main(String[] args) throws XMPPException  {
		// Create the configuration for this new connection
		ConnectionConfiguration config = new ConnectionConfiguration("jabber.com");
		config.setCompressionEnabled(true);
		config.setSASLAuthenticationEnabled(true);

		Connection connection = new XMPPConnection(config);
		// Connect to the server
		connection.connect();
		// Log into the server
		connection.login("Alexander_Sergeev", "ManuelNeuer", "jabber.ru");
		// Disconnect from the server
		connection.disconnect();



	}
}
