package ChangerPackage;

public class NumberFinder {
	public int find(char[] str) {
		int numbersAmount=0;
		int digitNum=0;
		for(int i=0;i<str.length;i++) {
			if((int)str[i]>=48&&(int)str[i]<=57) {
				digitNum++;
			}
			else if(digitNum>0){
				numbersAmount++;
				digitNum=0;
			}
		}
		return numbersAmount;
	}
}
