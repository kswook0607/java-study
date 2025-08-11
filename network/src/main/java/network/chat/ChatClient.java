package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class ChatClient {
	
	private static final String SERVER_IP = "127.0.0.1";
	private static final int PORT = 9000;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		Scanner scanner = null;
		
		try {
			socket = new Socket(SERVER_IP, PORT);
			
			pw = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			scanner = new Scanner(new InputStreamReader(System.in, "MS949"));
			
			ChatClientReceiver receiver = new ChatClientReceiver(br);
			
			receiver.start();
			
			while(true) {
				System.out.print(">>");
				String userInput = scanner.nextLine();
				pw.println(userInput);
				
				if(userInput.equalsIgnoreCase("quit")) {
					break;					
				}				
			}
												
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					
		} finally {
			
			try {
				if(scanner != null) {
					scanner.close();
				}
				if(br != null) {
					br.close();
				}
				if(pw != null) {
					pw.close();
				}
				if(socket != null && !socket.isClosed()) {
					socket.close();				
				}			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
}