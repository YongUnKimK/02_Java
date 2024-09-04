package edu.kh.array.practice.service;
import java.util.Arrays;
import java.util.Scanner;


public class PracticeService { // 기능 제공 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
//		길이가9인배열을선언및할당하고,
//		1부터9까지의값을반복문을이용하여
//		순서대로 배열의 각 인덱스요소에 대입하고출력한후
//		짝수번째인덱스값의합을출력하세요. 
//		(0 번째인덱스는짝수로취급)
//		 [실행화면]
//		 1 2 3 4 5 6 7 8 9
//		짝수번째인덱스합: 25
		int sum = 0;
		int[] num = new int [9]; 
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1 ;
			if ( (i) % 2 == 0 ) {
				sum += i+1;
			}
			System.out.print((i + 1) + " ");
			
		} 
		System.out.println();
		System.out.println("짝수번째 인덱스합: " + sum);
		
		
		
	}
	
	public void practice2() {
		
//		길이가9인배열을선언및할당하고,
//		9부터1까지의값을반복문을이용하여
//		순서대로배열의각인덱스요소에대입하고
//		출력한후
//		홀수번째인덱스값의합을출력하세요.
//		(0 번째인덱스는짝수로취급)
//		 [실행화면]
//		 9 8 7 6 5 4 3 2 1 
//		홀수번째인덱스합: 20
		int sum = 0;
		int[] num = new int [9]; 
		for (int i = 8; i >= 0; i--) {
			num[i] = i + 1 ;
			if ( (i) % 2 == 1 ) {
				sum += i+1;
			}
			System.out.print((i + 1) + " ");
			
		} 
		System.out.println();
		System.out.println("홀수번째 인덱스합: " + sum);
		
		
	}
	
	public void practice3() {
//		사용자에게입력받은양의정수만큼
//		배열크기를할당하고
//		1부터입력받은값까지배열에
//		초기화한후출력하세요.
//		 [실행화면]
//		양의정수: 5
//		 1 2 3 4 5 
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] array = new int [num];
		for(int i = 0; i < array.length; i++ ) {
			System.out.print( i+1 + " ");
		}
		
		
		
		
	}
	
	public void practice4() {
		int[] arr = new int[5];
		for(int i=0; i < arr.length; i++) {
			System.out.printf("입력 %d : ",i);			
			arr[i] = sc.nextInt();
		}		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		boolean flag = false;		
		for ( int i = 0; i< arr.length; i++) {
			if(search == arr[i] ) {
				System.out.println("인덱스 : " + i);
				flag = true; break;
			} 
			
		} if (flag != true ) {
			System.out.println("일치하는 값이 없습니다");}
		
	}
	
	public void practice5() {
		
		System.out.print("문자열");
		String str = sc.nextLine();
		char[] test = new char[str.length()];  
		
		for(int i = 0 ; i < test.length; i++) {
			test[i] = str.charAt(i);			
		}
		System.out.print("문자");
		char chr = sc.next().charAt(0); 
		int count = 0;
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str,chr );
		for (int i = 0; i < str.length(); i++ ) {
			if ( test[i] == chr ) {
				System.out.print(i);
				count++;}
			}
		
		System.out.println();
		
		System.out.printf("%s 개수 : %d",chr, count);
		
		
		
	}
	
	public void practice6() {
//		사용자가배열의길이를직접입력하여그값만큼
//		정수형배열을선언및할당하고
//		배열의크기만큼사용자가직접값을입력하여
//		각각의인덱스에값을초기화하세요.
//		그리고배열전체값을나열하고각인덱스에
//		저장된값들의합을출력하세요.
//		 [실행화면]
//		정수: 5
//		배열0번째인덱스에넣을값: 4
//		배열1번째인덱스에넣을값: -4
//		배열2번째인덱스에넣을값: 3
//		배열3번째인덱스에넣을값: -3
//		배열4번째인덱스에넣을값: 2
//		 4 -4 3 -3 2 
//		총합: 2
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] number = new int[num];
		int sum = 0;
		
		for(int i = 0; i < number.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int insert = sc.nextInt();
			number[i] = insert;
			sum += insert;
			
		}
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		System.out.print("총 합 : " + sum);

		
		
	}
	
	public void practice7() {
//		주민등록번호번호를입력받아성별을나타내는숫자이후부터*로가리고출력하세요.
//		 [실행화면]
//		주민등록번호(-포함) : 123456-1234567
//		 123456-1******
		
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
				
		char[] number = new char[num.length()];
		
		
		for ( int i = 0; i < number.length; i++) {
			number[i] = num.charAt(i);
			if (i > 7) {
				number[i] = '*';
			}
			
		}
		System.out.println(number);
		
		
		
		
	}
	
	public void practice8() {
		System.out.print("정수 : ");
		int num = sc.nextInt();	
		
		while(num % 2 != 1 || num < 3) {
			
			System.out.println("다시 입력하세요"); 
			System.out.print("정수 : ");
			int renum = sc.nextInt();
			num = renum ; continue;
		}
		
		int[] number = new int[num];
		for (int i = 0; i <= number.length / 2 ; i++) {
			System.out.print(i+1 + ", ");
			
		} String str = "";
		for (int i = number.length / 2 ; i >= 1 ; i--) {
			
			str += ( i + ", ");
			
		}	str = str.substring(0, str.length() - 2);
				System.out.print( str );	
	}
	
	public void practice9() {
//		10개의값을저장할수있는정수형배열을선언및할당하고,
//		 1~10 사이의난수를발생시켜배열에초기화한후출력하세요.
//		 [실행화면]
//		발생한난수: 9 7 6 2 5 10 7 2 9 6
		
		int[] num = new int[10];
		for(int i = 0 ; i < num.length; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
		} 
		System.out.print("발생한 난수 : ");
		
		for(int i = 0 ; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}
	
	public void practice10() {
		int[] num = new int[10];
		for(int i = 0 ; i < num.length; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
		} 
		System.out.print("발생한 난수 : ");
		for(int i = 0 ; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		int min = 10;
		int max = 0;
		
		for(int i = 0 ; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
			
		for(int i = 0 ; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i] ;
			}
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
	}
	
	public void practice11() {
//		 10개의값을저장할수있는정수형배열을선언및할당하고
//		1~10 사이의난수를발생시켜중복된값이없게배열에초기화한후출력하세요.
//		 [실행화면]
//		 4 1 3 6 9 5 8 10 7 2
		
		int[] num = new int[10];
		
		
		for (int i = 0 ; i < num.length; i++ ) {
			
			int number = (int) (Math.random() * 10 + 1  );
			
			num[i] = number;
			
			for( int x = 0 ; x < i; x++ ) {
				if(number == num[x]) {
					i--;
					
					
				}
				
			}
			
		} 
//		System.out.print(Arrays.toString(num));
		
		for (int i = 0; i <num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		
		
		
		
	}

	public void practice12() {
//		로또번호자동생성기프로그램을만들기.
//		 (중복값없이오름차순으로정렬하여출력하세요.)
		
		int[] lotto = new int [6];
		for(int i = 0 ; i < lotto.length; i++ ) {
			int number = (int)(Math.random() * 45 + 1);
			 lotto[i] = number;
			for(int j = 0; j < i;  j++) {
				if( number == lotto[j]) {
					i--;
				}				
			}
		} for ( int i = 0 ; i < lotto.length; i++) {
			Arrays.sort(lotto);
			System.out.print(lotto[i] + " ");
		}
		
		
	}

	public void practice13() {
//		문자열을입력받아문자열에
//		어떤문자가들어갔는지배열에저장하고
//		문자의개수와함께출력하세요
		System.out.print("문자열 : ");
		String lan = sc.nextLine();
		
		char[] arr = new char[lan.length()];
		
		for(int i = 0 ; i < arr.length; i++ ) {
			arr[i] = lan.charAt(i);
		} 
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0 ; i <arr.length; i++) {
			
			boolean flag = true; // 중복 체크용 flag
			
			// for문
			for (int j = 0 ; j < i ; j++) {
				
				if(arr[i] == arr[j]) {
					flag = false;; // 중복 발생했을 떄 
					break;
				}
			}
			
			if(flag== true) { //중복이 발생하지 않았을 경우
				if (i==0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				} count++;
				
			} 
			
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);
			
		
	}
	
	public void practice14() {
		
//		사용자가입력한배열의길이만큼의문자열배열을선언및할당하고
//		배열의인덱스에넣을값역시사용자가입력하여초기화하세요.
//		단, 사용자에게배열에값을더넣을지물어보고몇개를더입력할건지,
//		늘린곳에어떤데이터를넣을것인지받으세요.
//		사용자가더이상입력하지않겠다고하면배열전체값을출력하세요.
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자제거
		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for ( int i = 0 ; i < arr.length; i++) {
			System.out.print((i+1) +  "번째 문자열 : ");
			arr[i] = sc.nextLine();
			
		}
		// 3. 반복이 시작되는 구간부터 무한반복하는 while작성
		//	내부에 종료조건 만들어서 break
		
		while(true) {
			System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// 4 . 값을 더 입력할 경우!
			if(ch == 'y'|| ch== 'Y') {
				
				//5. 더 입력받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addsize = sc.nextInt();
				sc.nextLine(); //입력버퍼에 남은 개행문자 제거쓰
				
				// 6. 새로 값을 입력받은 배열 생성 --> 기존배열 크기 + 추가입력 개수
				String[] newArr = new String[arr.length + addsize];
				
				// 7. 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					
					if (i < arr.length) { // 인덱스의 크기가 기존배열보다 작을 경우
						newArr[i] = arr[i];
					} else { // 인덱스 크기가 기존 배열보다 클 경우 새로운 입력 받기
						System.out.print((i+1) + "번쨰 문자열 : ");
						newArr[i] = sc.nextLine();						
					}
				} 
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr대입
				arr = newArr;				
			} else if(ch == 'n' || ch == 'N') { //값을 더 입력하지 않을 경우
				break;
			} else { //잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}		
		}
			System.out.println(Arrays.toString(arr));
		
	}
}
	

