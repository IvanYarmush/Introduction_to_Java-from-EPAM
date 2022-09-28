package MainPackage;

import ChangerPackage.DigitFinder;
import ChangerPackage.NumberFinder;
import ChangerPackage.StringChanger;


public class Main {
	
	public static void main(String args[]) {
		//Task 1
		System.out.println("Task 1:");
		MyStr myStr11 = new MyStr(args[0]); 
		MyStr myStr12 = new MyStr(args[1]);
		MyStr myStr13 = new MyStr(args[2]);
		StringChanger changer = new StringChanger();
		MyStr myStr111 = changer.change(myStr11);
		MyStr myStr112 = changer.change(myStr12);
		MyStr myStr113 = changer.change(myStr13);
		myStr11.print();
		System.out.print("-->");
		myStr111.print();
		System.out.println();
		myStr12.print();
		System.out.print("-->");
		myStr112.print();
		System.out.println();
		myStr13.print();
		System.out.print("-->");
		myStr113.print();
		System.out.println();
		//1
		//Task 2
		System.out.println("Task 2:");
		MyStr myStr2 = new MyStr("word and word");
		char[] word = {'w','o','r','d'};
		char[] letter = {'l','e','t','t','e','r'};
		myStr2.print();
		System.out.println();
		MyStr myStr21 = changer.changeWords(myStr2.getValue(), word, letter);
		myStr21.print();
		System.out.println();
		//2
		//Task3
		System.out.println("Task 3:");
		MyStr myStr3=new MyStr("12str333ss2");
		DigitFinder digfinder= new DigitFinder();
		myStr3.print();
		System.out.println("\nAmount of digits:"+digfinder.find(myStr3.getValue()));
		//3
		//Task4
		NumberFinder numFinder = new NumberFinder();
		System.out.println("Amount of numbers:"+numFinder.find(myStr3.getValue())+" <-- Task 4");
		//4
		//Task 5
		System.out.println("Task 5:");
		MyStr myStr5 = new MyStr("  abc   prob  c  ");
		myStr5.print();
		System.out.println();
		MyStr myStr51 = changer.deleteSpace(myStr5.getValue());
		myStr51.print();
		//5
	}
}