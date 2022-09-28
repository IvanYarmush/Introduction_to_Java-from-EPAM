package MainPackage;

import OperationPackage.DoubleLetAndSpaceDeleter;
import OperationPackage.PalindromeChecker;
import OperationPackage.SpaceCounter;
import OperationPackage.bAfterAPaster;

public class Main {
	public static void main(String args[]) {
		//Task 1
		String str1=new String("sp  ace    spa c  e  ");
		System.out.println("Task 1:\n"+str1+"\nMax space amount: " + SpaceCounter.count(str1));
		//1
		//Task 2
		String str2 = new String("I must write a programm which pastes  char \'b\' after each char \'a\'");
		System.out.println("Task 2:\n"+str2+"\nAfter paste:\n" + bAfterAPaster.pasteBAfterA(str2));
		//2
		//Task 3
		String str3 = new String("øàëàø");
		String str31 = new String("Escape");
		System.out.println("Task 3:");
		if(PalindromeChecker.isPalindrome(str3)) {
			System.out.println(str3 + " is palindrome.");
		}
		else {
			System.out.println(str3 + " isn't palindrome.");
		}
		if(PalindromeChecker.isPalindrome(str31)) {
			System.out.println(str31 + " is palindrome.");
		}
		else {
			System.out.println(str31 + " isn't palindrome.");
		}
		//3
		//Task 4
		String str4 = new String("èíôîğìàòèêà");
		char tLetter=0;
		char oLetter=0;
		char rLetter=0;
		for(int i=0;i<str4.length();i++) {
			if(str4.charAt(i)=='ò') {
				tLetter = str4.charAt(i);
			}
			else if(str4.charAt(i)=='î') {
				oLetter = str4.charAt(i);
			}
			else if(str4.charAt(i)=='ğ') {
				rLetter = str4.charAt(i);
			}
		}
		String resStr4 = Character.toString(tLetter)+Character.toString(oLetter)+Character.toString(rLetter)+Character.toString(tLetter);
		System.out.println("Task 4:\n" + str4 + " --> " + resStr4);
		//4
		//Task 5
		String str5 = str2;
		int k=0;
		for(int i=0;i<str5.length();i++) {
			if(Character.toLowerCase(str5.charAt(i))=='a') {
				k++;
			}
		}
		System.out.println("Task 5:\n" + str5 +"\nAmount of letter \'a\' - " + k);
		//5
		//Task 6
		String str6 = new String("Hello");
		System.out.println("Task 6:");
		for(int i=0;i<str6.length();i++) {
			System.out.print(str6.charAt(i));
			System.out.print(str6.charAt(i));
		}
		//6
		//Task 7
		String str7 = new String("abc cde def");
		String str71 = DoubleLetAndSpaceDeleter.delSpacesNDoubleLetrs(str7);
		System.out.println("\nTask 7:\n" + str7 + " -->\n--> " + str71);
		//7
		//Task 8
		String str8 = str2;
		String [] strArr = str8.split(" ");
		int maxLength = 0;
		for(String el:strArr) {
			if(el.length()>maxLength) {
				maxLength = el.length();
			}
		}
		System.out.print("Task 8:\n" + str8 + "\nMax length word: ");
		for(String el:strArr) {
			if(el.length()==maxLength) {
				System.out.print(el +" ");
			}
		}
		//8
		//Task 9
		String str9 = new String("AAbbCcdd");
		int lowerCaseLet=0;
		int upperCaseLet=0;
		for(int i=0;i<str9.length();i++) {
			if((int) str9.charAt(i)>=65 && (int) str9.charAt(i)<=90) {
				upperCaseLet++;
			}
			else if((int) str9.charAt(i)>=97 && (int) str9.charAt(i)<=122) {
				lowerCaseLet++;
			}
		}
		System.out.println("\nTask 9:\nThere are " + upperCaseLet + " uppercase letters and "+ lowerCaseLet +
				" lowercase leters in string \"" + str9+"\".");
		//9
		//Task 10
		String xString = new String("1st sentenñe. 2nd! Is 3rd sentenñe here;)?");
		int sentenñeCounter = 0;
		for(int i=0;i<xString.length();i++) {
			if(xString.charAt(i) == '.' || xString.charAt(i) == '!' || xString.charAt(i) == '?') {
				sentenñeCounter++;
			}
		}
		System.out.println("Task 10:\nThere are " + sentenñeCounter + " sentenñes in string \"" + xString +"\"");
		//10
	}
}
