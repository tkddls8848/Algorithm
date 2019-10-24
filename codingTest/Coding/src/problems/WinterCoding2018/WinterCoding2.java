package problems.WinterCoding2018;

import java.util.*;

public class WinterCoding2 {

	public static boolean checkOver(int[] pos, char tmp, boolean[][] visited) {

		boolean checker = true;

		switch (tmp) {
		case 'U':
			if (pos[1] == visited.length) {
				checker = false;
				break;
			}
		case 'D':
			if (pos[1] == 0) {
				checker = false;
				break;
			}
		case 'L':
			if (pos[0] == 0) {
				checker = false;
				break;
			}
		case 'R':
			if (pos[0] == visited.length) {
				checker = false;
				break;
			}
		}

		return checker;
	}

	public static int[] move(int[] pos, int x, int y) {
		pos[0] += x;
		pos[1] += y;
		return pos;
	}

	public static boolean checkVisited(char tmp, int[] beforePos, boolean[][] visited) {
		
		boolean result = false;
		
		switch (tmp) {
		case 'U':
			if(!(visited[beforePos[0]][beforePos[1]]&&visited[beforePos[0]][beforePos[1]+1])) {
				result=true;
				break;
			}
		case 'D':
			if(!(visited[beforePos[0]][beforePos[1]]&&visited[beforePos[0]][beforePos[1]-1])) {
				result=true;
				break;
			}
		case 'L':
			if(!(visited[beforePos[0]][beforePos[1]]&&visited[beforePos[0]-1][beforePos[1]])) {
				result=true;
				break;
			}
		case 'R':
			if(!(visited[beforePos[0]][beforePos[1]]&&visited[beforePos[0]+1][beforePos[1]])) {
				result=true;
				break;
			}
		}

		return result;
	}

	public static int solution(String dirs) {

		int answer = 0;
		int len = dirs.length();
		boolean[][] visited = new boolean[11][11];
		int[] pos = { 5, 5 };

		for (int i = 0; i < len; i++) {
			char tmp = dirs.charAt(i);

			switch (tmp) {
			case 'U':
				if (checkOver(pos, tmp, visited)) {
					if (!(visited[pos[0]][pos[1]]&&visited[pos[0]][pos[1]+1])) {
						pos = move(pos, 0, 1);
						if(checkVisited(tmp, pos, visited)) {
							answer++;
							visited[pos[0]][pos[1]+1] = true;
						}
						System.out.println("answer"+answer+pos[0]+" "+pos[1]);
						break;
					} else {
						pos = move(pos, 0, 1);
						break;						
					}
				}
			case 'D':
				if (checkOver(pos, tmp, visited)) {
					if (!(visited[pos[0]][pos[1]]&&visited[pos[0]][pos[1]-1])) {
						pos = move(pos, 0, -1);
						if(checkVisited(tmp, pos, visited)) {
							answer++;
							visited[pos[0]][pos[1]-1] = true;
						}
						System.out.println("answer"+answer+pos[0]+" "+pos[1]);
						break;
					} else {
						pos = move(pos, 0, -1);
						break;						
					}
				}
			case 'L':
				if (checkOver(pos, tmp, visited)) {
					if (!(visited[pos[0]][pos[1]]&&visited[pos[0]-1][pos[1]])) {
						pos = move(pos, -1, 0);
						if(checkVisited(tmp, pos, visited)) {
							answer++;
							visited[pos[0]-1][pos[1]] = true;
						}
						System.out.println("answer"+answer+pos[0]+" "+pos[1]);
						break;
					} else {
						pos = move(pos, -1, 0);
						break;						
					}
				}
			case 'R':
				if (checkOver(pos, tmp, visited)) {
					if (!(visited[pos[0]][pos[1]]&&visited[pos[0]+1][pos[1]])) {
						pos = move(pos, 1, 0);
						if(checkVisited(tmp, pos, visited)) {
							answer++;
							visited[pos[0]+1][pos[1]] = true;
						}
						System.out.println("answer"+answer+pos[0]+" "+pos[1]);
						break;
					} else {
						pos = move(pos, 1, 0);
						break;						
					}
				}
			}
		}
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		String dirs = "ULURRDLLU";

		solution(dirs);

	}
}
