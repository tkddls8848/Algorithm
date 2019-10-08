package com.kitri.code.playlist;

import java.util.*;

public class Playlist {
	
	public static ArrayList<String> genreSet(String[] genre) {
		
		ArrayList<String> genreArr = new ArrayList<String>();
		genreArr.add(genre[0]);
		
		for(int i = 0 ; i < genre.length-1 ; i++) {
			for(int j = i+1 ; j < genre.length ; j++) {
				if(genre[i]!=genre[j]) {
					for(int k = 0 ; k < genreArr.size() ; k++) {
						if(!genreArr.contains(genre[j])) {
							genreArr.add(genre[j]);
						}
					}
				}
			}
		}
		return genreArr;
	}
	
	public static void sort(String[] genre, int[] plays) {
		
		HashMap<String, HashMap<ArrayList<Integer>, Integer>> totMap = new HashMap<String, HashMap<ArrayList<Integer>, Integer>>();
		ArrayList<String> genreList = genreSet(genre);
		
		for(int i = 0 ; i < genre.length ; i++) {
			HashMap<ArrayList<Integer>, Integer> musicMap = new HashMap<ArrayList<Integer>, Integer>();
			ArrayList<Integer> index = new ArrayList<Integer>();
			index.add(0);
			musicMap.put(, plays[i]);
			for(int j = i ; j < genre.length; j++) {
				if() {
					
				}
			}
//			System.out.println(genre[i]+" : "+ musicMap[0] +" and "+ musicMap[1]);
//			System.out.println(totMap.get(genre[i])[0]);
//			System.out.println(totMap.get(genre[i])[1]);
		}
	}
	
	public static void main(String[] args) {
		String[] genre = { "classic", "classic", "classic", "Metal", "Metal", "Metal" };
		int[] plays = { 500, 600, 150, 800, 2500, 20 };
		sort(genre, plays);
		
		
	}

}
