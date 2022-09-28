package OperationPackage;

public class SpaceCounter {
	public static int count(String str) {
		int counter=0;
		int max=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				counter++;
			}
			else if(counter > max) {
				max=counter;
				counter = 0;
			}
			else {
				counter = 0;
			}
		}
		return max;
	}
}
