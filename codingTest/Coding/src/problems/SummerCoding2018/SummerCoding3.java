package problems.SummerCoding2018;

import java.util.*;

public class SummerCoding3 {

	public static int destruction(int[][] land, int P, int height) {
		int desCost = 0;

		for(int i = 0 ; i < land.length ; i++) {
			for(int j = 0 ; j < land[i].length ; j++) {
				if(land[i][j]<=height) {
					desCost += 0;
				} else {
					desCost += P*(land[i][j]-height);
				}
			}
		}
		return desCost;
	}
	
	public static int construction(int[][] land, int Q, int height) {
		int conCost = 0;

		for(int i = 0 ; i < land.length ; i++) {
			for(int j = 0 ; j < land[i].length ; j++) {
				if(land[i][j]<=height) {
					conCost += Q*(height-land[i][j]);
				} else {
					conCost += 0;
				}
			}
		}
		return conCost;
	}
    
	
	public static long solution(int[][] land, int P, int Q) {
		long answer = -1;
		int totalCost = 0;
		int tmp = destruction(land,Q,0) + construction(land,P,0);
		
		for(int i = 1 ; i < Math.pow(10, 9) ; i++) {
			totalCost = destruction(land,Q,i) + construction(land,P,i);
			if(tmp < totalCost) {
				answer = tmp;
				break;
			} else {
				tmp = totalCost;
			}
		}

		return answer;
	}
    
    public static void main(String[] args) {

    	int[][] land = {{4, 4, 3}, {3, 2, 2}, {2, 1, 0}};
    	int P = 5;
    	int Q = 3;
    	
    	solution(land, P, Q);
    }
}
