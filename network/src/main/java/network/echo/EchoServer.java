package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {

	public static final int PORT = 9000;

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			log("starts...[port:" + PORT + "]");

			while (true) {

				Socket socket = serverSocket.accept();
				new EchoRequestHandler(socket).start();

			}

//			try {
//						InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
//						String romteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
//						int remotePort = inetRemoteSocketAddress.getPort();
//						log("connected by client[" + romteHostAddress + ":" + remotePort + "]");
//						
//					InputStream is = socket.getInputStream();
//										
//					PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
//					
//					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
//
//					while (true) {
//						
//										
//						byte[] buffer = new byte[256];
//						int readByteCount = is.read(buffer); 
//
//						if (readByteCount == -1) {
//							
//							System.out.println("[server] closed by client");
//							break;
//						}
//					while(true) {
//						String data = new br.readLine(); 
//						if(data == null) {
//							log("closed by client");
//							break;
//							}
//
//					log(" received: " + data);
//					pw.println(data);
//					
//					}
//					}catch(SocketException e){
//						
//						System.out.println("[sercer] Socket Exception: " + e);
//					}

		} catch (IOException e) {

			log("error: " + e);

		} finally {
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void log(String message) {
			
			System.out.println("[echo Server #"+ Thread.currentThread().getId()+ "]" + message);
		}
}
