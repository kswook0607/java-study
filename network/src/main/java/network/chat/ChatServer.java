package network.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class ChatServer {
	
	private static final int PORT = 9000;
	
	public static List<PrintWriter> clientList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(PORT);
			
			while(true) {				
				Socket clientSocket = serverSocket.accept();
				
				ChatRequestHandler handler = new ChatRequestHandler(clientSocket);
				handler.start();
			}
			
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}finally {
			
			if(serverSocket != null && !serverSocket.isClosed()) {
				try {
					
					serverSocket.close();
				
				}catch(IOException e) {
					e.printStackTrace();					
				}
				
			}
		
	}
}
	public static void broadcast(String message) {
		for(int i = 0; i < clientList.size(); i++) {
			
			PrintWriter writer = clientList.get(i);
			
			writer.println(message);
			
			}
		
	}
}
