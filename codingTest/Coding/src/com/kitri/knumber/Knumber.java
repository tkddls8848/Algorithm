package com.kitri.knumber;

import java.util.ArrayList;
import java.util.Collections;

public class Knumber {
	
	public static int subArray(int[] array, int[] commands) {
		
		ArrayList<Integer> result = new ArrayList<>();
		int answer = 0;
		
		for(int i = commands[0]-1 ; i < commands[1] ; i++) {
			result.add(array[i]);
		}
		Collections.sort(result);
		answer = result.get(commands[2]-1);
		return answer;
	}
	
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0 ; i < commands.length ; i++) {
            answer[i] = subArray(array, commands[i]);
            System.out.println("answer[i]"+answer[i]);
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		solution(array, commands);
	}
	
}
