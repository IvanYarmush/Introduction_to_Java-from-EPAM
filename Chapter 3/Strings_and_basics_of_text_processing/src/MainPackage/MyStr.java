package MainPackage;

public class MyStr {
	private char[] value=new char[20];
	
	
	public MyStr(String str) {
		for(int i=0;i<value.length;i++) {
			if(i<str.length()) {
				value[i]=str.charAt(i);
			}
			else {
				value[i]=(char) 0;
			}
		}
	}
	
	public MyStr(char[] charArr) {
		value=charArr;
	}
	
	public void print() {
		for(int i=0;i<value.length;i++) {
			if(value[i]!= (char) 0) {
				System.out.print(value[i]);
			}
		}
	}
	
	public char[] getValue() {
		return value;
	}
	
	public void setValue(char[] value) {
		this.value=value;
	}
	
}
