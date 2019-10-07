package com.kitri.code.permutation;

import java.util.HashSet;
import java.util.Set;

class Permutation {
    
    public static Boolean isPrime(int n){
        
    	boolean prime = false;
    	
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
    
    public static void permutationNumber(String prefix, String str, HashSet<Integer> answerList) {
    	
    	int len = str.length();
    	
    	if(!prefix.equals("") && str.length() == 0) {
    		answerList.add(Integer.parseInt(prefix));
    	}

    	for(int i = 0 ; i < len ; i ++) {
    		permutationNumber(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, len), answerList);
    	}
    	
    }
    
	public static void main(String[] args) {
		
		String str = "112";
		HashSet<Integer> answerList = new HashSet<Integer>();
		int result = 0;
		
		permutationNumber("",str,answerList);
		
		while(answerList.iterator().hasNext()) {
			int tmp = answerList.iterator().next();
			answerList.remove(tmp);
			
			if(isPrime(tmp)) {
				result++;
			}
		}
		
		System.out.println(result);
	}
    
}
