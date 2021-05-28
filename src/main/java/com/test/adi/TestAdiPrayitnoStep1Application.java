package com.test.adi;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.util.StringUtils;

public class TestAdiPrayitnoStep1Application {
	
	
	public static void main(String[] args) {
		
		//Step 1
		
		//1. As Java programmer what’s your comments about this code in a code review session

	    //akan menghasilkan data kosong karena varibale list baru di declare,
		//isinya belum di set tapi sudah di jadikan return dari fungsi
		
		//2. 
		String str ="aabbccddddddda";
        System.out.println(countChar(str));
        
        
        //3. There are two frogs on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). The first frog starts at location x1 and moves at a rate of v1 meters per jump. The second frog starts at location x2 and moves at a rate of v2 meters per jump. Given the starting locations and movement rates for each frog, can you determine if they'll ever land at the same location at the same time?
        //YES OUTPUT
        System.out.println("YES : " +frogs(0,3,4,2));
        
      //NO OUTPUT
        System.out.println("NO : " +frogs(1,2,3,2));
	}
	
	
	//2. Make a function to count the occurrences of a char in a string. Result string should be char immediately followed by its number of occurrences.
	public static String countChar(String str) {
		String result = "";
		Set<Character> objSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			objSet.add(str.charAt(i));
		}
		for (char c : objSet) {
			result = result + c + String.valueOf(StringUtils.countOccurrencesOf(str, String.valueOf(c)));
		}
		System.out.println(result);
		return result;
	}
	
	//3. There are two frogs on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). The first frog starts at location x1 and moves at a rate of v1 meters per jump. The second frog starts at location x2 and moves at a rate of v2 meters per jump. Given the starting locations and movement rates for each frog, can you determine if they'll ever land at the same location at the same time?
	public static String frogs(int x1, int v1, int x2, int v2) {
		String result = "";
		if (v1>v2&&(x2-x1)%(v1-v2)==0)
			result = "YES";
        else
        	result = "NO";
		return result;
		
	}

}
