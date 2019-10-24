package problems.SK;

import java.util.*;

public class CharSort {

	static ArrayList<String> arr = new ArrayList<>();
	
    public static ArrayList<String> permutation(char[] chars, int n, int k, int depth) {
    	
    	if(depth == k) {
    		String tmp = "";
    		for(int i = 0; i < chars.length ; i++) {
    			tmp+=chars[i];
    		}
    		arr.add(tmp);
    	}

    		
    	for(int i = depth ; i < n ; i++) {
    		swap(chars, i, depth);
    		permutation(chars, n, k, depth+1);
    		swap(chars, i, depth);
    	}
        
    	return arr;
    }
    
    public static void swap(char[] chars, int i, int depth) {
    	char tmp = chars[i];
    	chars[i] = chars[depth];
    	chars[depth] = tmp;
    }
	
	public static void main(String[] args) {
		
		String chars = "atjk";
		char[] arr = new char[chars.length()];
    	int n = chars.length();
    	int k = chars.length();
    	int flag = 0;
    	
    	for(int i = 0; i < chars.length() ; i++) {
    		arr[i] = chars.charAt(i);
    	}
    	
    	ArrayList<String> answer = permutation(arr, n, k, 0);
    	Collections.sort(answer);
		System.out.println(answer.size());
    	for(int j = 0; j < answer.size() ; j++) {
    		if(answer.get(j).equals(chars)) {
    			System.out.println(j);
    			break;
    		}
    	}
		
	}

}
