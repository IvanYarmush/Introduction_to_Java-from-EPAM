package ChangerPackage;

public class StrConcatenator {
	public char[] concatenate(char[] str1, char[] str2, char sep) {
		char[] resStr = new char[20];
		int endOfStr1 = 0;
		for(int i=0;i<resStr.length;i++) {
			if(str1[i]!=(char) 0) {
				resStr[i] = str1[i];
				endOfStr1++;
			}
			else if(str1[i-1]!=(char) 0){
				resStr[i]=sep;
				endOfStr1++;
			}
			else if(str2[i-endOfStr1]!=(char) 0){
				resStr[i]=str2[i-endOfStr1];
			}
			else {
				resStr[i]=(char) 0;
			}
		}
		return resStr;
	}
}
