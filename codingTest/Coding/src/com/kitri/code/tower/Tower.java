package com.kitri.code.tower;

import java.util.*;

public class Tower {

    public static int[] solution(int[] heights) {
        Stack<Integer> senderStack = new Stack<Integer>();
        int len = heights.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            senderStack.push(heights[i]);
         }
        int sender, receiver;
        for(int senderIndex = len-1; senderIndex>0; senderIndex--){ 
            sender = senderStack.pop();
            
            //receiver stack을 sender의 개수만큼 초기
            Stack<Integer> receiverStack = new Stack<Integer>(); 
            int receiverLength = senderIndex; //sender stack length -1 
            for(int i=0; i<receiverLength ;i++){
               receiverStack.push(heights[i]);
            }
            for(int receiverIndex=receiverLength-1 ;receiverIndex>=0 ;receiverIndex--){
                receiver = receiverStack.pop();
                if(receiver>sender){
                    answer[senderIndex]=receiverIndex+1;
                    break;
                }
            }
         }
         return answer;
    }

	public static void main(String[] args) {
		int[] heights = { 3, 9, 9, 3, 5, 7, 2 };
		int[] answer = solution(heights);
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.println(answer[i]);
		}
	}

}
