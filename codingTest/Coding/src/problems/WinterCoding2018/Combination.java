package problems.WinterCoding2018;

import java.util.*;

public class Combination {
	public static void main(String[] args) {
		int[] arr = new int[5];
		combination(arr, 0, 5, 3, 0);
		System.out.println(al.get(0)[0]+""+al.get(0)[1]+""+al.get(0)[2]);
	}

	static ArrayList<int[]> al = new ArrayList<>();
	
	public static void combination(int[] arr, int index, int n, int r, int target) {
		if (r == 0)
			save(arr, index);
		else if (target == n)
			return;
		else {
			arr[index] = target;
//			System.out.println("target"+target);
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
	}// end combination()

	public static void save(int[] arr, int length) {
		int[] save = new int[3];
		for (int i = 0; i < length; i++) {
			save[i] = arr[i];
			al.add(save);
			System.out.print(arr[i]);			
		}
		System.out.println("");
	}
}
