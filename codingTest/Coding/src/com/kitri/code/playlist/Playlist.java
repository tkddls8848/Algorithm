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
			for(int j = 0 ; j < genreList.size(); j++) {
				if(genreList.get(j)!=genre[i]) {
					musicMap[0] = i;
					musicMap[1] = plays[i];
					totMap.put(genre[i], musicMap);					
				} else if(genreList.get(j)==genre[i]) {
					musicMap[0] = i;
					musicMap[1] = plays[i];
					totMap.put(genre[i], musicMap);					
				} 
			}
			System.out.println(genre[i]+" : "+ musicMap[0] +" and "+ musicMap[1]);
			System.out.println(totMap.get(genre[i])[0]);
			System.out.println(totMap.get(genre[i])[1]);
		}
	}
	
	public static void main(String[] args) {
		String[] genre = { "classic", "classic", "classic", "Metal", "Metal", "Metal" };
		int[] plays = { 500, 600, 150, 800, 2500, 20 };
		sort(genre, plays);
		
		
	}

}
