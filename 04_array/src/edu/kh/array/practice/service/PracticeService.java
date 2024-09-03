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
				System.out.print("인덱스 : " + i);
				flag = true;
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
			
		}String str = "";
		for (int i = number.length / 2 ; i >= 1 ; i--) {
			
			str += ( i + ", ");
			
		}	str = str.substring(0, str.length() - 2);
				System.out.print( str);	
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
					break;
					
				}
				
			}
			
		} System.out.print(Arrays.toString(num));
		
		
		
		
	}
}
	

