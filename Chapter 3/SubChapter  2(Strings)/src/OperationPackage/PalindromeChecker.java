package OperationPackage;

public class PalindromeChecker {
	public static Boolean isPalindrome(String str) {
		if(str.equals(new StringBuilder(str).reverse().toString())) {
			return true;
		}
		return false;
	}
}
