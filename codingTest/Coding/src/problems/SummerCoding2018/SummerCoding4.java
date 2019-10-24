package problems.SummerCoding2018;

import java.util.*;

public class SummerCoding4 {

	public static int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		
		Arrays.sort(d);
		for(int i = 0 ; i < d.length ; i++) {
			sum += d[i];
			if(sum > budget) {
				break;
			} else {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		int[] d = { 2,2,3,3 };
		int budget = 10;

		solution(d, budget);
	}
}
