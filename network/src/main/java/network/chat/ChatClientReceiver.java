package network.chat;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientReceiver extends Thread {
	
	private BufferedReader br;
	
	public ChatClientReceiver(BufferedReader br) {
		this.br = br;
		
	}
	public void run() {
		
		try {
			String serverMessage;
			
			while((serverMessage = br.readLine()) != null) {
				System.out.println();
				System.out.println(serverMessage);
				System.out.println(">>");						
			}
			
		}catch(IOException e){
			e.printStackTrace();			
		}
	}
	
}
