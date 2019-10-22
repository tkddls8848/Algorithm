package com.kitri.code;

import java.util.*;

public class WinterCoding {
    public static int solution(int[] A, int[] B) {

    	int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = A.length - 1, j = B.length - 1; i >= 0; i--) {

            if(A[i] < B[j]) {
                answer++;
                j--;
            }
        }
        System.out.println(answer);
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] A = {5,1,3,7};
    	int[] B = {2,2,6,8};
    	
    	solution(A,B);
    }
}
