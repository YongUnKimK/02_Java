package edu.kh.network.server.run;

import edu.kh.network.server.model.service.ServerService;

public class ServerRun { 

	public static void main(String[] args) {
		
//		서버 : 서비스를 제공하는 프로그램or 컴퓨터
//		클라이언트 :서비스를 요청하여 사용하는 프로그램 or 컴퓨터
//
//		IP (Internet Protocol) 
//		포트(Port) : 같은 컴퓨터 내에서 프로그램을 식별하는 번호로 클라이언트는 서버 연결 요청 시 IP주소와 포트 번호를 알아야 함
//
//		소켓(Socket) : 프로세스 간의 통신에 사용되는 양쪽 끝 단
//		프로토콜(Protocol) : 컴퓨터 간의 정보를 주고 받을 때의 통신방법에 대한 규약으로 접속, 전달방식, 데이터형식, 검증방법등을 맞추기 위한 약속
//
//		TCP(Transmission Control Protocol)
//		데이터의 전달의 신뢰성을 최대한 보장하기 위한 방식으로 연결지향형 통신이다. 순차적으로 데이터를 전송하고 확인 및 오류 시 재전송을 한다.
//
//		 UDP(User Datagram Protocol)
//		데이터의 빠른 전달을 보장하기위한 방식으로 비연결 지향형 통신이다.
//		확인 및 재전송 작업이 없다.
		new ServerService().serverStart();

	}

}
