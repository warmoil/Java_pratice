package week11.hellosoket.inoutputstream;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx1 {
	
	

	public static void main(String[] args) {
		Socket socket = null;
		String myIp = "172.30.1.44";
		int portno = 9000;
		try {
			socket = new Socket(myIp,portno);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			//서버축으로 문자열 보내기
			String str = "Hello Server";
			out.write(str.getBytes());
					
			//서버측에서 보내온 문자열 읽어서 출력하기
			byte arr[]  = new byte[100];
			in.read(arr);
			//byte 형태인 arr을 String으로 바꿔줌
			System.out.println(new String(arr));
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
