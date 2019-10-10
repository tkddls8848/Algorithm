package com.kitri.dfsbfs;

public class PlusMinus {
	
	public static int dfs(int[] numbers, int target, int startDepth, int result) {
		
		if(startDepth == numbers.length) {
			if(result == target) {
				return 1;
			} else {
				return 0;
			}
		}
		
		return dfs(numbers, target, startDepth+1, result+1)+dfs(numbers, target, startDepth+1, result-1);
	}

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int startDepth = 0;
		int result = 0;
		
		System.out.println(dfs(numbers, target, startDepth, result));
		
	}
	
}
