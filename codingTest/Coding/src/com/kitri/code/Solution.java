package com.kitri.code;

class Solution {

	public int solution(int[] citations) {
		
		int answer = 0;

		for(int j=0 ; j < citations.length ; j++) {
			int cnt=0;
			int n = citations[j];	
			for(int i=0 ; i < citations.length ; i++) {
				if(citations[i]>n) {
					cnt++;
				}
			}
			System.out.println("cnt"+cnt);
			System.out.println("n"+n);
			if(cnt == n) {
				answer = cnt;
			}
		}
		return answer;
	}

}
