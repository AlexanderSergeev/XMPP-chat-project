package chat;

import java.io.IOException;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

public class Main {

	public static void main(String[] args) throws SmackException, IOException, XMPPException {

		AbstractXMPPConnection conn1 = new XMPPTCPConnection("username", "password", "jabber.org");
		conn1.connect();

	}

}
