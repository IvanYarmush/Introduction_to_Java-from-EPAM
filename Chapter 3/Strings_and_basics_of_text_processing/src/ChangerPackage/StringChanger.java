package ChangerPackage;

import MainPackage.MyStr;

//Class created for Task 1
public class StringChanger {
	
	public MyStr change(MyStr str) {
		char[] frstStrHalf = new char[20];
		char[] scndStrHalf = new char[20];
		char[] strValue = str.getValue();
		char underscore = '_';
		MyStr resStr = new MyStr("");
		for(int i=0;i<frstStrHalf.length;i++) {
			frstStrHalf[i]=(char) 0;
			scndStrHalf[i]=(char) 0;
		}
		if(Character.isLowerCase(strValue[0])){
			frstStrHalf[0]=strValue[0];
			for(int i=1;i<strValue.length;i++) {
				if(Character.isUpperCase(strValue[i])) {
					for(int j=i;j<strValue.length;j++) {
						if(strValue[j]!=(char) 0) {
							scndStrHalf[j-i]=strValue[j];
						}
						else {
							break;
						}
					}
					break;
				}
				frstStrHalf[i]=strValue[i];
			}
			StrConcatenator conc =  new StrConcatenator();
			scndStrHalf[0] = Character.toLowerCase(scndStrHalf[0]);
			
			resStr.setValue(conc.concatenate(frstStrHalf, scndStrHalf, underscore));
		}
		return resStr;
	}
	
	
	
	public MyStr changeWords(char[] str,char[] word1,char[] word2) {
		int wordStart=0;
		int wordEnd=0;
		int strEnd=0;
		for(int i=0;i<str.length;i++) {
			if(str[i]==(char) 0) {
				strEnd=i-1;
				break;
			}
		}
		int Indic = word1.length;
		for(int i=0,k=0;i<str.length;i++) {
			if(str[i]==word1[k]) {
				if(Indic==word1.length) {
					wordStart = i;
				}
				Indic--;
				k++;
				if(Indic == 0) {
					wordEnd=i;
					for(int j=strEnd;j>=wordEnd;j--) {
						str[j+word2.length-word1.length]=str[j];
					}
					for(int ii=wordStart,iw2=0;ii<=wordEnd+word2.length-word1.length;ii++,iw2++) {
						str[ii]=word2[iw2];
					}
					k=0;
					Indic=word1.length;
				}
			}
			else {
				k=0;
				wordStart=0;
				Indic=word1.length;
			}
		}
		MyStr resStr = new MyStr(str);
		return resStr;
	}
	
	public MyStr deleteSpace(char[] str) {
		int spaceCounter=0;
		for(int i=0;str[i]==' ';i++) {
			str[i]=(char) 0;
		}
		for(int i=0;i<str.length;i++) {
			if(str[i] == ' ') {
				spaceCounter++;
			}
			else {
				if(spaceCounter>1) {
					for(int j=i-1;spaceCounter>1;j--,spaceCounter--) {
						str[j]=(char) 0;
					}
				}
				spaceCounter=0;
			}
		}
		for(int i=str.length-1;str[i]==(char) 0 && str[i]==' ';i++) {
			str[i]=(char) 0;
		}
		MyStr resStr = new MyStr(str);
		return resStr;
	}
	
}
