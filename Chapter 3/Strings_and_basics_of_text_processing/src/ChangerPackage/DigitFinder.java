package ChangerPackage;

public class DigitFinder {
	public int find(char[] str){
		int num=0;
		for(int i=0;i<str.length;i++) {
			if((int)str[i]>=48&&(int)str[i]<=57) {
				num++;
			}
		}
		return num;
	}
}
