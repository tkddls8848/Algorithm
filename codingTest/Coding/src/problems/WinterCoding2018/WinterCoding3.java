package problems.WinterCoding2018;

import java.util.*;

public class WinterCoding3 {

	public static void combination(int[] cookie, int index, int n, int k, int flag, int[] answer) {


		if(k == 0) {
			System.out.println(answer[0]+""+answer[1]+""+answer[2]);
		} else if(index == n) {
			return;
		} else {
			answer[flag] = index;
			combination(cookie, index+1, n, k-1, flag+1, answer);
			combination(cookie, index+1, n, k,  flag, answer);

		}
		
	}
	
    public static int solution(int[] cookie) {
    	int result=0;
        int[] answer = new int[6];
//        	숫자 사이에 3개의 칸막이 세개의 인덱스 combination
//        l~m m+1~r각각의 합
//        같으면 목록에 추가
//        각 단계 후보군 sort 후 가장 큰거 답
        
//		int n = cookie.length + 1;
//		int k = 3;
//		int[] arr = new int[n];
//		for(int i = 0 ; i < n; i++) {
//			arr[i] = i;
//		}        
        combination(cookie, 0, 5, 3, 0, answer);
        return result;
    }
    
    public static void main(String[] args) {

    	int[] cookie = {1,2,3,4,8};
    	
    	solution(cookie);
    	
    }
}
