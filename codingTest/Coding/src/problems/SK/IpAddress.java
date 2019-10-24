package problems.SK;

import java.util.*;

public class IpAddress {

	public static ArrayList<String> spliter(String address) {
		ArrayList<String> arr = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(address, ".");
		
    	while(st.hasMoreTokens()) {
    		String tmp = st.nextToken();
    		arr.add(tmp);
    	}
    	
    	return arr;
	}
	
	public static boolean checker(String[] checkAddress, String address) {
		
		ArrayList<String> arrMy = spliter(address);
		int check = 0;
		boolean result = false;
		
		for(int i = 0 ; i < checkAddress.length ; i++) {
			
			ArrayList<String> arrBad = spliter(checkAddress[i]);
			
			if((arrMy.get(0)).equals(arrBad.get(0))&&(arrMy.get(1)).equals(arrBad.get(1))&&(arrMy.get(2)).equals(arrBad.get(2))&&(arrMy.get(3)).equals(arrBad.get(3))) {
				check++;
			}
		}

		if(check == 0) {
			result = true;
		}
		
		return result;
	}
	
    public static int solution(String[] badAddress, String[] passAddress, String myAddress) {

    	int result = 2;
    	
    	if(!checker(badAddress, myAddress)) {
    		result = 0;
    	}
    	if(!checker(passAddress, myAddress)) {
    		result = 1;
    	}
        return result;
    }
    
    public static void main(String[] args) {
    	String[] badAddress = {"321.321.123.1","123.123.123.123"};//stat 0
    	String[] passAddress = {"1.11.23.1","3.13.123.123"};//stat 1
    	String myAddress = "11.11.23.1";//이상없으면 stat 2
    	
    	int result = solution(badAddress,passAddress,myAddress);
    	System.out.println(result);
    	
    }

}
