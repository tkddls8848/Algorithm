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
		System.out.println("��� ���� ���ϴ� ���� ���Ͻÿ� ");
		int _Size = scan.nextInt();
		Sum = scan.nextInt();
		Arr = new int[_Size];
		System.out.println("������ �Է��Ͻÿ� ");
		for (int i = 0; i < _Size; i++) {
			Arr[i] = scan.nextInt();
		}
		partSum(_Size);
		System.out.println("���� : " + Count);

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
