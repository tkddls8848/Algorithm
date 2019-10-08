package com.kitri.code.playlist;

import java.util.*;

public class Playlist2 {

	public static HashMap<Integer, String> parseMap(String[] obj) {

		HashMap<Integer, String> hm = new HashMap<>();

		for (int i = 0; i < obj.length; i++) {
			hm.put(i, obj[i]);
		}

		return hm;
	}

	public static HashMap<Integer, Integer> parseMap(int[] obj) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < obj.length; i++) {
			hm.put(i, obj[i]);
		}

		return hm;
	}

	public static ArrayList<String> sortGenre(String[] genre) {

		ArrayList<String> genreList = new ArrayList<String>();
		genreList.add(genre[0]);

		for (int i = 0; i < genre.length - 1; i++) {
			for (int j = i + 1; j < genre.length; j++) {
				if (genre[i] == genre[j]) {
				} else if (genre[i] != genre[j]) {
					for (int a = 0; a < genreList.size(); a++) {
						if (!genreList.contains(genre[j])) {
							genreList.add(genre[j]);
						}
					}
				}
			}
		}
		for (int b = 0; b < genreList.size(); b++) {
			System.out.println("genreSort : " + genreList.get(b));
		}
		return genreList;
	}

	public static HashMap<String, ArrayList<Integer>> indexSort(ArrayList<String> genreList, String[] genre) {

		HashMap<Integer, String> genreMap = parseMap(genre);
		HashMap<String, ArrayList<Integer>> answerMap = new HashMap<>();

		for (int i = 0; i < genreList.size(); i++) {
			ArrayList<Integer> musicIndex = new ArrayList<Integer>();
			for (int j = 0; j < genreMap.size(); j++) {
				if (genreMap.get(j) == genreList.get(i)) {
					musicIndex.add(j);
					answerMap.put(genreList.get(i), musicIndex);
				}
			}
			System.out.println(genreList.get(i) + "의 indexSort : " + answerMap.get(genreList.get(i)));

		}
		return answerMap;
	}

	public static void sort(String[] genre, int[] plays) {

		HashMap<Integer, Integer> playsMap = parseMap(plays);
		HashMap<String, Integer> playsTot = new HashMap<String, Integer>();
		ArrayList<String> genreList = sortGenre(genre);
		HashMap<String, ArrayList<Integer>> indexMap = indexSort(genreList, genre);

		for (int i = 0; i < genreList.size(); i++) {
			ArrayList<Integer> idx = indexMap.get(genreList.get(i));
			int tot = 0;
			System.out.println(idx);
			for (int j = 0; j < idx.size(); j++) {
				System.out.println(idx.get(j) + "번은 몇 분 : " + playsMap.get(idx.get(j)));
				tot += playsMap.get(idx.get(j));
				playsTot.put(genreList.get(i), tot);
			}
			System.out.println(genreList.get(i) + "의 전체 : " + playsTot.get(genreList.get(i)));
		}
		descArray(playsMap, indexMap, playsTot);
	}

	public static void descArray(HashMap<Integer, Integer> playsMap, HashMap<String, ArrayList<Integer>> indexMap,
			HashMap<String, Integer> playsTot) {

		ArrayList<Integer> finalSort = new ArrayList<Integer>();
		
		

	}

	public static void main(String[] args) {
		String[] genre = { "classic", "pop", "Rock", "opera", "pop", "Metal" };
		int[] plays = { 500, 600, 150, 800, 2500, 20 };
		sort(genre, plays);
	}

}
