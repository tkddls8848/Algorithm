package com.kitri.SummerCoding;

import java.util.*;

public class SummerCoding2 {
	
	public static int repeatWord(String[] words) {
		
		HashMap<Integer, String> wordsMap = new HashMap<Integer, String>();
		int wrong = 0;
		
		for(int i = 0 ; i < words.length ; i++) {
			if(wordsMap.containsValue(words[i])) {
				wrong = i + 1;
				break;
			}
			wordsMap.put(i, words[i]);
		}
		return wrong;
	}	
	
	public static int wrongWord(String[] words) {
		
		int wrong = 0;
		
		for(int i = 0 ; i < words.length - 1 ; i++) {
			char b = words[i].charAt(words[i].length()-1);
			char a = words[i+1].charAt(0);
			if(a!=b) {
				wrong = i + 1 + 1;
				break;
			}

		}		
		return wrong;
	}
	
    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int wrongTry = 0;
        int wrongPerson = 0;
        
        if(wrongWord(words) != 0 && repeatWord(words) != 0) {
        	wrongPerson = Math.min(wrongWord(words), repeatWord(words));
        } else {
        	wrongPerson = Math.max(wrongWord(words), repeatWord(words));

        };

        
        if(wrongPerson%n == 0 && wrongPerson != 0) {
        	answer[0] = n;
        } else if(wrongPerson == 0) {
        	answer[0] = 0;
        } else {
        	answer[0] = wrongPerson%n;
        }
        
        while(!(wrongPerson<n)) {
        	wrongPerson = wrongPerson-n;
//            System.out.println("wrongPerson"+wrongPerson);
        	wrongTry++;
        }
        if(wrongPerson != 0) {
        	wrongTry++;
        }
        answer[1] = wrongTry;
//        System.out.println("answer[0]"+answer[0]);
//        System.out.println("answer[1]"+answer[1]);
        return answer;
        
    }
    
    public static void main(String[] args) {

    	String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang","gather", "refer", "reference", "estimate", "executive"};
    	int n = 5;
    	
    	solution(n, words);
    }
}
