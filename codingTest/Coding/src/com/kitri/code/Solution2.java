package com.kitri.code;

import java.util.*;

public class Solution2 {

	public static int doFuc(double w, double h, int x) {

		double resultY = 0;
		int count = 0;

		if (h > w) {
			resultY = (w / h) * (double)(x + 0.5);
			System.out.println("resultY" + resultY);
			if (resultY != (int)resultY) {
				count = count + 1;
			}
		} else if (h < w) {
			resultY = (h / w) * (double)(x + 0.5);
			System.out.println("resultY" + resultY);
			if (resultY != (int)resultY) {
				count = count + 1;
			}
		} else if (h == w) {
			count = 1;
		}

		System.out.println("count" + count);
		return count;
	}

	public static long solution(int w, int h) {
		long answer = (w * h);
		double dw = (double) w;
		double dh = (double) h;

		int min = Math.max(w, h);
		for (int i = 0; i < min; i++) {
			answer -= doFuc(dw, dh, i);
		}
		System.out.println("answer" + answer);
		return answer;
	}

	public static void main(String[] args) {

		solution(6,6);
	}

}
