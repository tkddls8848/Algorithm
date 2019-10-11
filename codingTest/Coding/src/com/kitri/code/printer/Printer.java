package com.kitri.code.printer;

import java.util.*;

public class Printer {
	
	public static int max(Queue<Integer> que) {
		
        List<Integer> arrList = new ArrayList<Integer>();
        Queue<Integer> queTmp = new LinkedList<Integer>();
        
        for(int i = 0; i< que.size() ; i++) {
        	arrList.add(que.peek());
        	que.add(que.poll());
    		System.out.println("arr"+arrList.get(i));
        }
        
        int max = Collections.max(arrList);
        
		System.out.println("max"+max);
		return max;
	}
	
    public static int solution(int[] priorities, int location) {
    	
        int answer = 0;
        int count = 0;
        
        Queue<Integer> que = new LinkedList<Integer>();
        Queue<Integer> queTmp = new LinkedList<Integer>();
        
        for(int i = 0 ; i < priorities.length ; i++) {
        	que.add(priorities[i]);
            System.out.println("priorities"+i+priorities[i]);
        }


        
        while(!que.isEmpty()) {
            int a = priorities[location];
            int max = max(que);
            int peek = que.peek();

            if(max == a) {
            	break;
            } else if(max != a) {
            	int num = que.poll();
            	if(max > peek) {
                	queTmp.add(num);
            	} else if(max == peek || a == que.poll()) {
                	que.poll();
                	count++;
            		System.out.println("count"+count);
            		System.out.println("queTmp.size()"+queTmp.size());
            		while(!queTmp.isEmpty()) {
                		System.out.println("queTmp"+queTmp.peek()); 
                		que.add(queTmp.poll());

                	}  
            	}
            }
        }

        System.out.println("a"+(count+1));       
       
        return (count);
        
    }
    
    public static void main(String[] args) {
    	int[] priorities = {2,1,3,2};
    	int location = 3;
    	
    	solution(priorities, location);
//        Queue<Integer> que = new LinkedList<Integer>();
//        
//        for(int i = 0 ; i < priorities.length ; i++) {
//        	que.add(priorities[i]);
//        }
//        max(que);
    }
}
