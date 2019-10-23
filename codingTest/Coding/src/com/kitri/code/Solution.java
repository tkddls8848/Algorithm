package com.kitri.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Solution {
	static int Arr[];
	static int Sum = 0;
	static int Count = 0;

	public static void main(String[] args) {
		System.out.println("http://jsieun73.tistory.com/");
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 수와 원하는 합을 말하시오 ");
		int _Size = scan.nextInt();
		Sum = scan.nextInt();
		Arr = new int[_Size];
		System.out.println("수들을 입력하시오 ");
		for (int i = 0; i < _Size; i++) {
			Arr[i] = scan.nextInt();
		}
		partSum(_Size);
		System.out.println("답은 : " + Count);

	}

	static void partSum(int _Size) {
		int trySum = 0;
		for (int i = 0; i < _Size; i++) {
			trySum = 0;
			for (int j = i; j < _Size; j++) {
				trySum += Arr[j];
				if (Sum == trySum) {
					Count++;
				}
			}
		}
	}
}
