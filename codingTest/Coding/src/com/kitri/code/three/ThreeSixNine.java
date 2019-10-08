package com.kitri.code.three;

public class ThreeSixNine {

	
	public static void reapter(int reapter) {
		
		for(int i = 0 ; i < reapter ; i ++) {
			checkDigit(i);			
		}

	}
	
	public static void checkDigit(int number) {

		int len = 0;
		int tmp = number;
		
		while(!(number<10)) {
			int rest = number-(number/10);
			number = number/10;
			if(rest != number) {
				len++;
			}
		}
		checkThree(len, tmp);
	}
	
	public static void checkThree(int digit, int number) {
		
		int len = digit+1;
		char[] list = new char[len];
		String str = Integer.toString(number);
		
		for(int i = 0 ; i < len ; i++) {
			list[i] = str.charAt(i);
		}
		
		for(int j = 0 ; j < list.length ; j++) {
			if(list[j] == '3' || list[j] == '6' || list[j] == '9') {
				list[j] = '-';
			}
		}
		print(list);
	}
	
	public static void print(char[] result) {
		
		for(int i = 0 ; i < result.length-1 ; i++) {
			System.out.print(result[i]);
		}
		System.out.print(result[result.length-1]+" ");
		
	}
	
	public static void main(String[] args) {
		
		reapter(100);

	}

}
