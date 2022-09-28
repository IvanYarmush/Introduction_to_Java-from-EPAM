package mainPackage;

import java.util.Arrays;

public class Main {
	public static void  main(String args[]) {
		int n = 10;
		int k = 5;
		int sum = 0;
		//Task 1
		int a [] = new int [n];
		for (int i=0;i<n;i++) {
				a[i]=i+1;
				if(a[i] % k == 0) {
					sum += a[i];
				}
			}
		System.out.println("Task 1: " + sum);
		// 1
		
		//Task 2
		int ChangeCounter = 0;
		double z=6.25;
		double b[] = new double[n];
		for(int i=0, j = -6;i<n;i++, j++) {
			b[i]=j+0.5;
			if(b[i]>z) {
				b[i]=z;
				ChangeCounter++;
			}
		}
		System.out.println("\nTask 2: " + Arrays.toString(b) + "\nCount of changes: " + ChangeCounter);
		//2
		
		//Task 3
		int NegElems=0;
		int PosElems=0;
		int ZeroElems=0;
		b[3]=b[4]=0;
		for(int i=0;i<n;i++) {
			if(b[i]>0) {
				PosElems++;
			}
			else if(b[i]<0) {
				NegElems++;
			}
			else {
				ZeroElems++;
			}	
		}
		System.out.println("\nTask 3:\n" + Arrays.toString(b)+"\nPositive Element Count: " + PosElems +
				"\nNegative Element Count: " + NegElems + "\nZero Element Count: " + ZeroElems);
		//3
		
		//Task 4
		a[4]=-1;
		a[5]=-6;
		int MinElem=a[0];
		int MaxElem=a[0];
		int MaxElemInd=0;
		int MinElemInd=0;
		int value=0;
		for(int i=1;i<n;i++) {
			if(a[i]<MinElem) {
				MinElem=a[i];
				MinElemInd=i;
			}
			if(a[i]>MaxElem) {
				MaxElem = a[i];
				MaxElemInd = i;
			}
		}
		System.out.println("\nTask 4:\n" + Arrays.toString(a));
		value=a[MinElemInd];
		a[MinElemInd]=a[MaxElemInd];
		a[MaxElemInd]=value;
		System.out.println(Arrays.toString(a));
		//4
		
		//Task 5
		System.out.println("\nTask 5:\n" + Arrays.toString(a));
		for(int i=0;i<n;i++) {
			if(a[i]>i) {
				System.out.print(a[i] + " ");
			}
		}
		//5
		
		//Task 6
		sum = a[1];
		for(int i=2;i<n;i++) {
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					break;
				}
				else {
					sum+=a[i];
				}
			}
		}
		System.out.println("\n\nTask 6:\n" + Arrays.toString(a) + "\nSum: " + sum);
		//6
		
		//Task 7
		a[3]=6;
		int max=a[0]+a[n-1];
		for(int i=1,j=n-2; i<j; i++,j--) {
				max=((a[i]+a[j])>max)?(a[i]+a[j]):max;
		}
		System.out.println("\nTask 7:\n" + Arrays.toString(a) + "\nMax(a[i]+a[j]): " + max);
		//7
		
		//Task 8
		a[0]=a[2]=a[4]=-6;
		System.out.println("\nTask 8:\n" + Arrays.toString(a));
		MinElem=a[0];
		for(int i=0;i<n;i++) {
			MinElem=(a[i]<MinElem)?a[i]:MinElem;
		}
		for(int i=0;i<n;i++) {
			if(a[i]!=MinElem) {
				System.out.print(a[i] + " ");
			}
		}
		//8
		
		//Task 9
		a[0]=-7;
		a[1]=-7;
		a[3]=-7;
		int TempCount=0;
		int MaxCount=0;
		int result=0;
		double UniqueNumArr [] = new double [n];
		int UniqueNumCountersArr [] = new int [n];
		int UniqueNumCounter=0;
		for(int i=0;i<n;i++) {
			UniqueNumArr[i]=4.5;
			UniqueNumCountersArr[i]=0;
		}
		System.out.println("\n\nTask 9: ");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n-1;i++) {
			TempCount=0;
			//System.out.print(a[i]+": "+Arrays.binarySearch(UniqueNumArr, a[i])+" ");
			if(Arrays.binarySearch(UniqueNumArr, a[i])!=0) {
				result = a[i];
				for(int j=i+1;j<n;j++) {
					if(result == a[j]) {
						TempCount++;
					}
				}
				//System.out.println(a[i]);		
				MaxCount=(TempCount>MaxCount)?TempCount:MaxCount;
				UniqueNumArr[UniqueNumCounter] = a[i];
				UniqueNumCounter++;
				UniqueNumCountersArr[i] = TempCount;
			}
			else {
				continue;
			}
		}
		MinElem = (int) Math.pow(10,6);
		for (int i=0;i<n;i++) {
			if(MaxCount==UniqueNumCountersArr[i] && (UniqueNumArr[i]%1)==0) {
				MinElem=(int) ((UniqueNumArr[i]<MinElem)? UniqueNumArr[i]:MinElem);
			}	
		}
		System.out.println("Answer is: " + MinElem);
		//System.out.println(Arrays.toString(UniqueNumArr));
		//9
		
		//Task 10
		System.out.print("\n\nTask 10:/nArray before: \n");
		System.out.println(Arrays.toString(a));
		for(int i=1;i<n;i+=2) {
			a[i]=0;
		}
		System.out.println("Array after:\n" + Arrays.toString(a));
		System.out.println("Compressed array:");
		for(int num:a) {
			if(num!=0) {
				System.out.print(num + " ");
			}
		}
		//10
		
	}
}
