package week11.hellosoket.inoutputstream;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
		int portno = 9000;
		
		//서버는 소켓이 2개!
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		
		try {
			
			//서버의 9000번 포트를 열고 서버포트를 만듬 
			serverSocket = new ServerSocket(portno);
			
			//클라이언트의 요청을 기다렸다가 요청을기다렸다가 요청에 응답하고 
			//클라이언트를 처리할 클라이언트 소켓을 하나 생성함 
			socket = serverSocket.accept();
			
			//스트림 생성하즈아!
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			//데이터 교환
			byte arr[] = new byte[100];
			//받을 통신
			in.read(arr);
			System.out.println(new String(arr));
			//보낼 통신
			String str = "Hello Client?";
			out.write(str.getBytes());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			}
			catch(Exception e) {
				
			}
			try {
				serverSocket.close();
			}
			catch(Exception e) {
				
			}
		}

	}

}
