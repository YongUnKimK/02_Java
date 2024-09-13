package edu.kh.basic;

class Solution {
    public String solution(String my_string, int n) {
        char[] array = new char[my_string.length()];
        String answer = "";
        for (int i = 0; i < n; i++){
            array[i] = my_string.charAt(i);
            answer += array[i];
        }
        
         return answer;
    }
}