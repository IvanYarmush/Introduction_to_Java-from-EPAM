package OperationPackage;

public class bAfterAPaster {
	public static String pasteBAfterA(String str) {
		String[] strMas = str.split("a");
		return String.join("ab", strMas);
	}
}
