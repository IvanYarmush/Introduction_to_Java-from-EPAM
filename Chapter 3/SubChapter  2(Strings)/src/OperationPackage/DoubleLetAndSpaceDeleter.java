package OperationPackage;

import java.util.HashSet;
import java.util.Set;

public class DoubleLetAndSpaceDeleter {
	public static String delSpacesNDoubleLetrs(String str) {
		boolean  spaceFound = false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spaceFound = true;
				break;
			}
		}
		if(spaceFound) {
			String str1 = str.replaceAll(" ", "");
			Set<Character> set = new HashSet<Character>();
			StringBuilder sb = new StringBuilder();
			for(char c: str1.toCharArray()) {
				if(!set.contains(c)) {
					set.add(c);
					sb.append(c);
				}
			}
			return sb.toString();
		}
		else {
			Set<Character> set = new HashSet<Character>();
			StringBuilder sb = new StringBuilder();
			for(char c: str.toCharArray()) {
				if(!set.contains(c)) {
					set.add(c);
					sb.append(c);
				}
			}
			return sb.toString();
		}
	}
	
}
