package problems.WinterCoding2018;

import java.util.*;

public class WinterCoding4 {
	
	public static int check(String skill, String skill_tree) {

		int index = 0;
		int j;
		
		for(int i = 0 ; i < skill.length() ; i++) {
			for(j = 0 ; j < skill_tree.length() ; j++) {
				if(skill.charAt(i) == skill_tree.charAt(j)) {
					if(index > j) {
						return 0;
					} else {
						index = j;
						break;
					}
				}
			}
			index = j;
		}
		
		
		return 1;
	}
	
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        answer = check(skill, skill_trees[0]);
        System.out.println(answer);
        return answer;
    }
    
    public static void main(String[] args) {
    	String skill = "CBD";
    	String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
    	
    	solution(skill,skill_trees);
    }
}
