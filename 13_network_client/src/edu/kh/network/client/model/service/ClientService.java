package edu.kh.network.client.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientService { 
	public void clientStart() {
		
//		1)서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		// 클라이언트용 소켓 객체 생성
		
		
		// 서버 IP 주소 : 198.50.212.22
		
		//String serverIp = InetAddress.getLocalHost().getHostAddress();
		// 1) 현재 컴퓨터의 로컬 IP 주소를 얻어오는 방법
		// 다른 컴퓨터가 서버면 ip주소를 입력해줘야함
		// String serverIp = "198.50.212.22";
		
		String serverIp = "127.0.0.1"; 
		// 2) loop back IP(현재 컴퓨터를 나타내는 IP)
		
		int port = 8500;
		
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("[Client]");
			clientSocket = new Socket(serverIp, port);
			// UnknownHostException : IP가 잘못되었을 때 발생하는 예외

			// 2)서버와의 입출력 스트림 오픈
			if(clientSocket != null) { // 서버와 연결이 성공한 경우 
				
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
//			3)보조 스트림을 통해 성능 개선
				br = new BufferedReader(new InputStreamReader(is));
				// InputStreamReader : 바이트를 문자 단위로 입력하는 문자 변환 보조 스트림
				
				pw = new PrintWriter(os);
//			4)스트림을 통해 읽고 쓰기
				
				String serverMessage = br.readLine();						
				// 서버 -> 클라이언트에게 보낸 메세지를 한 줄 읽어와
				
				System.out.println("serverMessage");
				//콘솔창에 출력 
				
				// -----------------------------------------
				
				// 클라이언트 -> 서버로 메시지 전송
				Scanner sc = new Scanner(System.in);
				
				System.out.print("서버로 전달할 메시지 : ");
				String str = sc.nextLine();
				
				pw.println(str); // 메세지를 클라이언트-> 서버쪽으로 출력
				pw.flush();
				
				// --------------------------------------------------
				// 서버 -> 클라이언트 메세지 읽어오기
				System.out.println("서버가 보낸 메시지 : " + br.readLine());
				
			} 
			

		} catch( UnknownHostException e ) {
			System.out.println("잘못된 IP주소입니다");
		}
		catch(Exception e) {
			e.printStackTrace();
		} finally {

//			5)통신 종료
			try {
				// 스트림/ 소켓 닫는 일
				
				if (br!= null) br.close();
				if (pw!= null) pw.close();
				if (clientSocket != null) clientSocket.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		




	}
}
