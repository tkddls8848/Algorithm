package problems.WinterCoding2018;

import java.util.*;

public class WinterCoding3 {

	static int[] pSum;

	public static int solution(int[] cookie) {
		int answer = 0;
		pSum = new int[cookie.length + 1];
		for (int i = 1; i < pSum.length; i++) {
			pSum[i] = pSum[i - 1] + cookie[i - 1];
		}
		for (int i = 1; i < pSum.length - 1; i++) {
			for (int j = pSum.length - 1; j > i; j--) {
				int r = find(i, j);
				if (answer < r) {
					answer = r;
				}
			}
		}
		return answer;
	}

	public static int find(int start, int end) {
		int i = start, j = end;
		while (start < end) {
			int mid = (start + end) / 2;
			int s1 = pSum[mid] - pSum[i - 1], s2 = pSum[j] - pSum[mid];
			if (s1 == s2) {
				return s1;
			} else if (s1 < s2) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		int[] cookie = { 1, 2, 3, 1 };

		solution(cookie);

	}
}
