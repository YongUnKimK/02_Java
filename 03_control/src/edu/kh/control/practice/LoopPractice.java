package edu.kh.control.practice;
import java.util.Scanner;
public class LoopPractice { //기능 제공 클래스
	
	
	Scanner sc = new Scanner(System.in);

	
	public void practice1(){
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
						
		System.out.print(" 1이상의 숫자를 입력하세요 ");
		int num = sc.nextInt() ;
		if (num <=  0) {System.out.println(" 1 이상의 숫자를 입력해 주세요");}
		for (int i=1; i <= num ; i++  ) { System.out.print( i + " "); }
		
	}


	public void practice2() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		System.out.print("1이상의 숫자를 입력해 주세요");
		int num = sc.nextInt();
		
		if(num <= 0) {System.out.println("1이상의 숫자를 입력하세요");} 
		
		for(int i = num; i >=  1 ; i--) {
				System.out.print( i + " ");
				
		}
		
		
		
	}

	public void practice3() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		
		System.out.print(" 숫자를 입력하세요 ");
		int num = sc.nextInt();
		int result = 0;
		for ( int i = 1  ; i <= num ; i++) {
			
			result += i;
			
		} 
		
		System.out.print(result);
		
		
		
	}

	public void practice4() {
//		
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.print(" 첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print(" 두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");			
		} 
		if (num1 < num2) {
			for (int i = num1 ; i <= num2; i++ ) {
				System.out.print(i + " ");
			}} else {
				for (int i = num2 ; i <= num1; i++ ) {
					System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

	public void practice5() {
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.printf("==================%d단====================\n",num);
		for(int i = 1 ; i <= 9; i++ ) {
			int result = num * i;
			System.out.printf("%d * %d = %d\n", num, i, result );
			 
		}
		
		
		
	}

	public void practice6() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		if( num < 2 || num > 9) {System.out.println("2~9사이 숫자만 입력해주세요");}
		else {
			for ( int i = 2 ; i <= num; i++) {
			
			System.out.printf("==================%d단====================\n",num);
			for(int i1 = 1 ; i1 <= 9; i1++ ) {
				int result = i * i1;
				System.out.printf("%d * %d = %d\n", i, i1, result );
				 
			}}
		}
		
		
		
		
		
	}

	public void practice7() {
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		
		System.out.print(" 정수 입력 : ");
		int num = sc.nextInt();
		
			String first = "";
			for ( int i1 = 1; i1 <= num; i1++) {
			
			first += "*";			
			System.out.println(first);}	
		
	}

	public void practice8() {
		System.out.print(" 정수 입력 : ");
		
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= num ; i++) {
			for(int j = num ; j >= i ; j--) {
				System.out.print("*");
			} System.out.println();
		}
			// 내가 입력한 input값을 row에 대입하여 반복할떄마다 1씩 감소함
		
			
		
		
	}
	
	public void practice9() {
//		정수입력: 4
//		    *
//		   **
//		  ***
//		 ****
		System.out.print( " 정수 입력 : ");
		
		int num = sc.nextInt();
		for(int i = 1 ; i <= num; i++) {
			
			for(int j = num; j > i ; j--) {
			System.out.print(" ");				
			}
			for(int k = 1; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice10() {
		
//		 정수입력: 3
//	  *
//	  **
//	  ***
//	  **
//	  *
		System.out.print( " 정수 입력 : ");
		
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			} System.out.println();
		}
		
		for (int i1 = num-1; i1 >= 1; i1-- ) {
			for(int j2 = 1; j2 <= i1; j2++) {
				System.out.print("*");
			} System.out.println();
			
		}

	}
	public void practice11() { 
// 정수입력 : 4      왼쪽에서부터 공백 포함
//		   *		input(4) + row(1) - 1 == 4 ( 한 행에 열(col)이 4번 반복해 공백or별을찍음
//		  ***		input(4) + row(2) - 1 == 5 
//		 *****
//		*******
		
		
		
		
		
		
		
		
		System.out.print( " 정수 입력 : ");
		
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= num ; i++ ) {
			
			for(int i1 = num-i ; i1 > 0; i1-- ) {System.out.print(" ");
				
			} 
			for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
             System.out.println();
			
		}
		
		

		
		
	}

	public void practice12() {
//		정수입력: 5
//		 *****
//		 *   *
//		 *   *
//		 *   *
//		 *****
		System.out.print( " 정수 입력 : ");		
		int num = sc.nextInt();
		for(int i=1 ; i <=num ; i++) {
			
			for(int i1 = 1; i1 <= num; i1 ++ ) {
				
				if(i1 ==1 || i1 == num || i == 1 || i ==num) {
					System.out.print("*");
				} else {System.out.print(" ");}
			}

			System.out.println();
		}
		
		
	}
	
	
	public void practice13() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i % 2 == 0 || i % 3 ==0 ) {
				System.out.print(i + " ");
			
				if(i % 2 == 0 && i % 3 ==0 ) {
					// 갯수세기 
					count++;
				}				
			}							
		}				
		System.out.println("\ncount : " + count );
	}
	
}	

