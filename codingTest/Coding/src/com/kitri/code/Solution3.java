package com.kitri.code;

import java.util.*;

class Solution3 {
    
    public static long gcp(int w,int h){
        
        int min = Math.min(w,h);
        int result = 1;

        for(int i = min; i > 0 ; i-- ){
            if(h%i == 0 && w%i == 0){
                return i;
            }
        }
        
        return result;
    }
    
    public static int checker(long l,long m){
        int result = 0;
        double res1,res2;

        for(int i = 0 ; i < l ; i++){
            for(int j = 0 ; j < m ; j++){
//                System.out.println();
//                System.out.println("x"+i);
//                System.out.println("y"+j);
//                System.out.println("minW"+minW);
//                System.out.println("minH"+minH);
                res1 = functionResult(l,m,i) - (double)(j);
                res2 = functionResult(l,m,i+1) - (double)(j+1);
//                System.out.println("functionResultres1"+functionResult(minW,minH,i));
//                System.out.println("functionResultres2"+functionResult(minW,minH,i+1));
//                System.out.println("res1"+res1);
//                System.out.println("res2"+res2);
                if(res1*res2 < 0){
                    result++;
                    System.out.println("result");    
                }
            }
        }
        return result;
    }
    
    public static double functionResult(double minW,double minH, double i){
        
        double function = -((minH/minW)*(i))+minH;
        
        return function;
    }
    
	public static long solution(int w,int h) {
		long answer = 1;
        long mulitiple = gcp(w,h);
       
        answer = (w*h) - (mulitiple*checker(w/mulitiple, h/mulitiple));
        System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(1000,1);
	}

}
