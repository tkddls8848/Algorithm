package problems.WinterCoding2019;

import java.util.*;

public class WinterCoding1 {
    
    public static long gcp(int w,int h){
        
        int min = Math.min(w,h);
        long result = 1;

        for(int i = min; i > 0 ; i-- ){
            if(h%i == 0 && w%i == 0){
                return i;
            }
        }
        
        return result;
    }
    
    
	public static long solution(int w,int h) {
		long answer = 1;

        answer = ((long)w*(long)h) - (w+h-gcp(w,h));

		return answer;
	}

	public static void main(String[] args) {
		solution(100000000,30);
	}

}
