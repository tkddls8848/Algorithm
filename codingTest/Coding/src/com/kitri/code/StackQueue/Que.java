package com.kitri.code.StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static ArrayList<Integer> judge(LinkedList<Integer> que, int time) {
		
		
		Queue<Integer> queue = que;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int num = 0;
		
		while(!queue.isEmpty()) {
			if(queue.poll() <= time) {
				num++;
			} else {
				arrayList.add(num);
				num = 1;
				arrayList.add(num);
			}
		}

		return arrayList;
	}

	public static ArrayList<Integer> complete(int[] p, int[] s, int time) {
		
		int duration=0;
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i = 0 ; i < p.length ; i++) {
			while(p[i]<100) {
				p[i] += s[i];
				duration++;
			}
			ll.add(i, duration);
			System.out.println(duration);
			duration=0;
		}
		return judge(ll, time);
	}

	public static void main(String[] args) {

		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		Queue<Integer> queue = new LinkedList<Integer>();
		
		ArrayList<Integer> arrayList = complete(progresses, speeds, 7);	
		
		for(int i = 0 ; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i));
		}

	}
	
}
