package com.kitri.code;

import java.util.HashSet;
import java.util.Set;

class Permutation {
    
    public static Boolean isPrime(String str){
        
        Boolean prime = false;
        
        int n = Integer.parseInt(str);
        
        if(n == 1) {
        	prime = false;
        } else {
            for(int a=2 ; a < Math.sqrt(n) ; a++){
                if(n%a==0){
                    prime=false;
                    break;
                } else if(n%a !=0) {
                    prime=true;
                }
            }
        }
        System.out.println("isPrime"+prime);
        return prime;
    }
    
    public static char[] splitNumber(String s){
    	
    	char[] arr = new char[s.length()];
    	
    	for(int i = 0 ; i < s.length() ; i++) {
    		arr[i] = s.charAt(i);
            System.out.println("arr"+arr[i]);
    	}

        return arr;
    }
    
    public static void permutationNumber(char[] arr, int depth, int r, HashSet answerList) {
    	
    	
    	
    }
    

    
	public static void main(String[] args) {
		
		String str = "123";
		HashSet answerList = new HashSet<>();
		
		permutationNumber(splitNumber(str), 3, 3, answerList);
		

	}
    
}
