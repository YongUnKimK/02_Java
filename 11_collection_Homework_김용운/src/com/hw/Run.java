package com.hw;

public class Run {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] num_list) {
		        int answer = 0;
		        int multi = 1;		// 곱셈
		        int sum = 0;		// 더하기
		        
		        for (int i = 0; i < num_list.length; i++) {
		            multi *= num_list[i];
		            sum += num_list[i];
		            
		            if (multi < Math.pow(sum, 2)) {
		                answer = 1;
		            } else {
		                answer = 0;
		            }
		        }
		        
		        return answer;
		    }
		}
		
	}

}
