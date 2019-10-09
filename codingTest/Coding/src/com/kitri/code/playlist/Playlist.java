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
	
	public static HashMap<Integer, String> parseMap(String[] obj) {

		HashMap<Integer, String> hm = new HashMap<>();

		for (int i = 0; i < obj.length; i++) {
			hm.put(i, obj[i]);
		}

		return hm;
	}
	
	public static void sort(String[] genre, int[] plays) {
		
		HashMap<Integer, HashMap<String, Integer>> totMap = new HashMap<Integer, HashMap<String, Integer>>();
		ArrayList<String> genreList = genreSet(genre);
		HashMap<Integer, String> genreMap = parseMap(genre);
		
		for(int i = 0 ; i < genre.length ; i++) {
			HashMap<String, Integer> musicMap = new HashMap<String, Integer>();
			musicMap.put(genre[i], plays[i]);
			totMap.put(i, musicMap);
			System.out.println("totMap"+totMap.get(i));
		}

		for(int k = 0 ; k < totMap.size(); k++) {
			HashMap<String, Integer> tmpMap = totMap.get(k);
			String key = (String) totMap.get(k).keySet().iterator().next();	
			int value = tmpMap.get(key);
		}
		
		for(int j = 0 ; j < totMap.size(); j++) {
			ArrayList<Integer> idxList = new ArrayList<Integer>();
			if(totMap.get(j).get(genreList.get(0))!=null) {
				idxList.add(totMap.get(j).get(genreList.get(0)));
				System.out.println(totMap.get(j).get(genreList.get(0)));				
			}
		}
	}
	
	public static void main(String[] args) {
		String[] genre = { "classic", "classic", "pop", "Metal", "pop", "Metal" };
		int[] plays = { 500, 600, 150, 800, 2500, 20 };
		sort(genre, plays);
		
	}

}
