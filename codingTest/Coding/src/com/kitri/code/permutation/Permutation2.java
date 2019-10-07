package com.kitri.code.permutation;

class Permutation2 {
    
	public static void permutation(int[] arr, int depth, int n, int r) {
		
		if(depth == r) {
			print(arr, r);
		}
		
		for(int i = depth ; i < n ; i++) {
			swap(arr, i, depth);
			permutation(arr, depth + 1, n, r);
			swap(arr, i, depth);
		}
		
	}
	
	public static void print(int[] arr, int r) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(i != arr.length-1) {
				System.out.print(arr[i]);				
			} else {
				System.out.println(arr[i]);					
			}

		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		permutation(arr,0,4,4);
		
	}
    
}
