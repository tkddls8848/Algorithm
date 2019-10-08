package com.kitri.code.baseballgame;

import java.util.HashMap;

public class Baseball {

	public static boolean[] checkArray(int[][] baseballGame) {

		int[] game = new int[baseballGame.length];
		int[] strike = new int[baseballGame.length];
		int[] ball = new int[baseballGame.length];
		System.out.println("len"+baseballGame.length);
		boolean[] result = new boolean[baseballGame.length];
		for(int k = 0 ; k < baseballGame.length ; k++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.println("baseballGame["+k+"]["+j+"]"+baseballGame[k][j]);				
			}
		}
		for(int i = 0 ; i < baseballGame.length ; i++) {
			game[i] = baseballGame[i][0];
			System.out.println("game[i]"+game[i]);
			strike[i] = baseballGame[i][1];
			System.out.println("strike[i]"+strike[i]);
			ball[i] = baseballGame[i][2];
			System.out.println("ball[i]"+ball[i]);
			result[i] = checkGame(game[i], 147, strike[i], ball[i]);
			System.out.println("result["+i+"]"+result[i]);
		}
		
		return result;
		
	}
	
	public static boolean checkGame(int game, int tmp, int strike, int ball) {
		
		boolean result = false;
		boolean s = countStrike(game, tmp, strike);
		boolean b = countBall(game, tmp, ball);
		
		if(s && b) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	public static boolean countStrike(int game, int tmp, int strike) {
		
		String[] gameTmp = new String[3];
		String[] tmpTmp = new String[3];
		int cntStrike = 0;
		boolean correct = false;
		
		for(int j = 0 ; j < 3 ; j++) {
			gameTmp[j] = String.valueOf(game).substring(j, j+1);
			System.out.println("g"+gameTmp[j]);
			tmpTmp[j] = String.valueOf(tmp).substring(j, j+1);
			System.out.println("t"+tmpTmp[j]);
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			if(gameTmp[i].equals(tmpTmp[i])) {
				cntStrike++;
			}
		}
		
		if(cntStrike == strike) {
			correct = true;
		} else {
			correct = false;
		}
		System.out.println(cntStrike);
		return correct;
	}
	
	public static boolean countBall(int game, int tmp, int ball) {
		
		String[] gameTmp = new String[3];
		String[] tmpTmp = new String[3];
		int cntBall = 0;
		boolean correct = false;
		
		for(int j = 0 ; j < 3 ; j++) {
			gameTmp[j] = String.valueOf(game).substring(j, j+1);
			System.out.println("g"+gameTmp[j]);
			tmpTmp[j] = String.valueOf(tmp).substring(j, j+1);
			System.out.println("t"+tmpTmp[j]);
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int k = 0 ; k < 3 ; k++) {
				if(gameTmp[i].equals(tmpTmp[k])) {
					cntBall++;
					System.out.println("cntBall[j]"+cntBall);
				}
			}

		}
		
		if(cntBall == ball) {
			correct = true;
		} else {
			correct = false;
		}
		
		return correct;
	}
	
	public static void checkAll(int[] arr, int depth, int n, int r) {
		
		if(depth == r) {
			int tmp = 0;
			for(int j = 0 ; j < r ; j++) {
				tmp += arr[j]*(int)Math.pow(10, r-j-1);
			}
		}
		
		for(int i = depth ; i < n ; i++) {
			swap(arr, i, depth);
			checkAll(arr, depth+1, n, r);
			swap(arr, i, depth);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		
		int[][] baseballGame = {{123,1,1},{456,0,1},{789,0,1}};//´ä 147 °¡Á¤
		boolean[] check = checkArray(baseballGame);
		
		for(int i = 0 ; i < check.length ; i++) {
			if(check[i]) {
				System.out.println("true");
			} else {
				System.out.println("f");
			}			
		}


	}

}
