package mainPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class Main {
	public static void main(String[] args) {
					// 1.Linear programms
		
		System.out.println("\n1. Linear Programms\n");
		
		//Task 1
		double a = 5;
		double b = 4;
		double c = 3;
		double z=((a-3)*b/2)+c;
		System.out.println("Task 1 : z =((a-3)*b/2)+c = "+"((" + a +"-3)*"+ b+ "/2)+" +c + " = "+z);
		
		//Task 2
		z = (b+Math.sqrt(Math.pow(b,2) +4*a*c))/2/a - Math.pow(a,3)*c +Math.pow(b,-2);
		System.out.println("Task 2 : " + z);
	
		//Task 3
		double x=50;
		double y=30;
		z=(Math.sin(Math.toRadians(x))+Math.cos(Math.toRadians(y)))/
				(Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y)))*
				Math.tan(Math.toRadians(x*y));
		System.out.println("Task 3 : " + z);
		
		//Task 4
		double r = 123.555;
		double n = (int) r;
		double result = (n / 1000)+(r-n)*1000;
		System.out.println("Task 4 : " + result);
		
		//Task 5
		int time =4123;
		int hours=time/3600;
		time-=hours*3600;
		int mins = time/ 60;
		time -= mins*60;
		int seconds = time;
		System.out.println("Task 5 : " + hours+"h "+mins+"m "+seconds + "s");
		
		//Task 6
		x = 0;
		y = -1.49999;
			System.out.println("Task 6 :\nx:" + x +"\ny:" + y);
		if((y < -0.5 && y > -1.5) && (x < 0.5 && x > -0.5)) {
			System.out.println("Answer : false");
		}
		else if(((x >=-3 && x <= 3) && (y < 0 && y >= -3)) || ((x >=-2 && x <= 2) && (y >= 0 && y <= 4))) {
			System.out.println("Answer : true");	
		}
		else {
			System.out.println("Answer : false");
		}
		
		
		
					// 2. Branching
		
		System.out.println("\n2. Branching\n");
		
		//Task 1
		double alpha = 30.5;
		double beta = 59.5;
		double gamma = 0;
		if( alpha + beta < 180) {
			gamma =180-alpha-beta;
			System.out.println("Task 1 :\nThe triangle exist. It has angles : \nalpha = "+alpha+" degrees\n"
					+ "beta = "+beta+" degrees\n" + "gamma = "+gamma+" degrees");
			if(gamma==90) {
				System.out.println("This triangle is right.");
			}
			else {

				System.out.println("This triangle isn't right.");
			}
		}
		
		//Task 2
		a = 3;
		b = 1;
		c = 27;
		double d = 0;
		String symbol;
		if(a<=b) {
			if(c<=d) {
				if(a>=c) {
					symbol = Double.toString(a);
				}
				else {
					symbol = Double.toString(c);
				}
			}
			else if(a >= d) {
				symbol = Double.toString(a);
			}
			else {
				symbol = Double.toString(d);
			}
		}
		else {
			if(c<=d) {
				if(b>=c) {
					symbol = Double.toString(b);
				}
				else {
					symbol = Double.toString(c);
				}
			}
			else if(b >= d) {
				symbol = Double.toString(b);
			}
			else {
				symbol = Double.toString(d);
			}
		}
		System.out.println("Task 2 :\na = "+a+"\nb = "+b+"\nc = "+c+"\nd = "+d);
		System.out.println("Answer is "+symbol);
	
		//Task 3
		double x1=4,y1=6;
		double x2=2,y2=3;
		double x3=0,y3=0;
		double alpha1=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2))/(y2-y1);
		double alpha2=Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2))/(y3-y2);
		
		if(((((x2-x1)*(y2-y1))*((x3-x2)*(y3-y2))>=0))&&(alpha1==alpha2)) {
			System.out.println("Task 3:\nAnswer is true");
		}
		else {
			System.out.println("Task 3:\nAnswer is false");
		}
	
		//Task 4
		a=1;
		b=4;
		x=3;
		y=4;
		z=4;
		double ab=a*b;
		System.out.println("Task 4:");
		if(x*y<=ab||x*z<=ab||y*z<=ab) {
			System.out.println("The brick will go through the hole.");
		}
		else {
			System.out.println("The brick will not go through the hole.");
		}
		
		//Task 5
		double f=0;
		x=4;
		if(x<=3) {
			f=Math.pow(x, 2)-3*x+9;
		}
		else {
			f=1/(Math.pow(x, 3)+6);
		}
		System.out.println("Task 5:\nx = " + x +"\nAnwer is "+f);
		
		
					//3. Cycles
		
		System.out.println("\n3. Cycles\n");
		
		//Task 1
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Task 1:\n¬ведите число:");
		double k = scanner.nextDouble();
		System.out.println(k);*/
		double k = 125;
		double sum=0;
		for(int i=1;i<=k;i++) {
			sum+=i;
		}
		System.out.println("Task 1: Answer is "+sum);
		
		//Task 2
		a=0;
		b=10;
		double h=1;
		System.out.println("Task 2:");
		for(double i=a;i<=b;i+=h) {
			if(i>2 && i!=b) {
				System.out.print(i+"; ");
			}
			else if (i <= 2){
				System.out.print(-i+"; ");
			}
			else {
				System.out.println(i);
			}
		}
		//Task 3
		for(int i=1;i<=100;i++) {
			sum+=Math.pow(i, 2);
		}
		System.out.println("Task 3: "+sum);
		
		//Task 4
		long power=1;
		for(int i=1;i<200;i++) {
			power*=Math.pow(i, 2);
		}
		System.out.println("Task 4: "+power);
		
		//Task 5
		double e=0.3;
		int counter=0;
		n=100;
		sum=0;
		for(int i=0;i<n;i++) {
			a=1/Math.pow(2, i)+1/Math.pow(3, i);
			if(Math.abs(a)>=e) {
				sum+=a;
				counter++;
			}
			if(counter==3) { 
				System.out.println("Task 5: " + sum);
				break;
			}
			else if (i==n-1){
				System.out.println("Task 5: There are no 3 mumbers whose abs >= 3.");
			}
		}
		
		
		//Task 6
		System.out.println("Task 6:");
		for (int i=1;i<256;i++) {
			System.out.print(i+"--"+(char) i+"	");
			if(i%5==0) {
				System.out.println("");
			}
		}
		
		//Task 7
		n=0;
		System.out.println("Task 7: ");
		System.out.print("Print the 'm' and 'n' values: m-");
		Scanner scan =new Scanner(System.in);
		if(scan.hasNextInt()) {	
			int m=scan.nextInt();
			System.out.print(" n-");
			n=scan.nextInt();
			for (int i=m; i<=n;i++) {
				System.out.print("\nDivisors of "+i+": ");
				for(int k1=2;k1<i;k1++) {
					if(i%k1==0) {
						if(k1!=i-1) {
						System.out.print(k1 + "; ");
						}
						else {
							System.out.println(k1);
						}
					}
				}
			}
		}
		else {
			System.out.println("Scanner can't read integer values.");
		}
		
		//Task 8
		System.out.println("\nTask 8:");
		int xx=2578888;
		int yy=772;
		System.out.println("1-е число: " + xx);
		System.out.println("2-е число: " + yy);
		ArrayList<Integer> array_xx = new ArrayList<Integer>();
		ArrayList<Integer> array_yy = new ArrayList<Integer>();
		while(xx>0) {
			array_xx.add(xx % 10);
			xx/=10;
		}
		while(yy>0) {
			array_yy.add(yy % 10);
			yy/=10;
		}
		TreeSet<Integer> TreeSet_xx = new TreeSet<Integer>(array_xx);
		TreeSet<Integer> TreeSet_yy = new TreeSet<Integer>(array_yy);
		System.out.print("÷ифры в 1-м числе: ");
		TreeSet_xx.forEach(item->{
			System.out.print(item + " ");
		});
		System.out.println("");
		System.out.print("÷ифры во 2-м числе: ");
		TreeSet_yy.forEach(item->{
			System.out.print(item + " ");
		});
		System.out.print("\nAnswer : ");
		TreeSet_yy.forEach(item->{
			if(TreeSet_xx.contains(item)) {
				System.out.print(item + " ");
			}
		});
		
		
		
		
	}	
}
