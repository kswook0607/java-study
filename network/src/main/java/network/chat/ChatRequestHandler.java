package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatRequestHandler extends Thread {
	
	
	private Socket socket;
	private String nickname;
	private PrintWriter pw;

	public ChatRequestHandler(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	
	}	
	
	public void run() {
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);
			
			pw.println("닉네임을 입력하세요");
			nickname = br.readLine();
			
			
			ChatServer.clientList.add(pw);
			
			ChatServer.broadcast(nickname + "님이 입장하셨습니다.");
			
			String message;
			
			while((message = br.readLine()) != null) {
				
				if(message.equalsIgnoreCase("quit")) {
					break;
				}
				ChatServer.broadcast(nickname + ":" + message);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			
			ChatServer.clientList.remove(pw);
            	
			ChatServer.broadcast(nickname + "님이 퇴장하셨습니다.");				
			
			
			try {
				if(socket != null && !socket.isClosed()) {
					socket.close();					
				}
			}catch(IOException e) {
				e.printStackTrace();
		}
		
	}
}
}
