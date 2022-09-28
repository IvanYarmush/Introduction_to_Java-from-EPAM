package mainPackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
			int n=5;
		//Task 1
			int matrix[][]=new int [n][n];
			System.out.println("Task 1:\nMatrix:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix[i][j]=(int)(Math.random()*5 + 1);
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Answer is:");
				for(int j=0;j<n;j+=2) {
					for(int i=0;i<n;i++) {
						if(matrix[0][j]>matrix[n-1][j]) {
							System.out.println(matrix[i][j]);
						}
						else {
							break;
						}	
					}
					System.out.println();
				}
		//1
			
		//Task 2
			System.out.println("Task 2:\nMatrix:");
			for(int i=0;i<n;i++) {
				System.out.print(matrix[i][i]+" ");
			}
		//2
		
		//Task 3
			int k=3;
			int p=2;
			System.out.println("\n\nTask 3:\nk = "+k+"\np = "+p+"\nMatrix:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			for(int i=0;i<n;i++) {
				System.out.print(matrix[k-1][i]+ " ");
			}
			System.out.println("\n");
			for(int i=0;i<n;i++) {
				System.out.println(matrix[i][p-1]);
			}
		//3
			
		//Task 4
			n=4;
			int value=1;
			System.out.println("\nTask 4:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i%2==0) {
						matrix[i][j]=value++;
					}
					else {
						matrix[i][j]=--value;
					}
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		//4
		
		//Task 5
			System.out.println("\nTask 5:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix[i][j]=0;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-i;j++) {
					matrix[i][j]=i+1;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		//5
			
		//Task 6
			n=10;
			int matrix2[][]=new int [n][n];
			System.out.println("\nTask 6:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix2[i][j]=1;
				}
			}
			for(k=1,p=n-2;k<n/2;k++,p--) {
				for(int j=0, i=n-1;j<k;j++,i--) {
					matrix2[k][j]=0;
					matrix2[k][i]=0;
					matrix2[p][j]=0;
					matrix2[p][i]=0;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix2[i][j]+" ");
				}
				System.out.println();
			}
		//6
		
		//Task 7
			System.out.println("\nTask 7:");
			int PositiveElemCounter=0;
			double matrix3[][]=new double [n][n];
			for(int i=0;i<n;i++) {
				for	(int j=0;j<n;j++) {
					if((matrix3[i][j]=Math.sin(Math.toRadians((i*i-j*j)/n)))>0) {
						PositiveElemCounter++;
					}
					System.out.print(new DecimalFormat("#0.00").format(matrix3[i][j])+" ");
				}
				System.out.println();
			}
			System.out.println("\nCount of positive elements: "+PositiveElemCounter);
		//7
			
		//Task 8
			/*Scanner scanner = new Scanner(System.in);
			System.out.print("\nTask 8:\nÂגוהטעו םמלונא סעמכבצמג:");
			int FirstColumnNumber = scanner.nextInt()-1;
			int SecondColumnNumber=scanner.nextInt()-1;
			System.out.println("Matrix before changing:");*/
			n=5;
			int matrix4 [][]=new int[n][n];
			int VariableColumn[]=new int[n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix4[i][j]=(int)(Math.random()*5 + 1);
					System.out.print(matrix4[i][j]+" ");
				}
				System.out.println();
			}
			/*for(int i=0;i<n;i++) {
				VariableColumn[i]=matrix4[i][FirstColumnNumber];
				matrix4[i][FirstColumnNumber]=matrix4[i][SecondColumnNumber];
				matrix4[i][SecondColumnNumber]=VariableColumn[i];
			}
			System.out.println("Matrix after changing:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix4[i][j]+" ");
				}
				System.out.println();
			}*/
		//8
			
		//Task 9
			System.out.println("\nTask 9:");
			int ColumnSum;
			int MaxSum=0;
			for(int j=0;j<n;j++) {
				ColumnSum=0;
				for(int i=0;i<n;i++) {
					ColumnSum+=matrix4[i][j];
					System.out.print(matrix4[i][j]+" ");
				}
				System.out.println();
				MaxSum=(ColumnSum>MaxSum)?ColumnSum:MaxSum;
			}
			System.out.println("MaxSum: " + MaxSum);
		//9
			
		//Task 10
			System.out.println("\nTask 10:\nPositive diagonal elements:");
			for(int i=0;i<n;i++) {
				if(matrix4[i][i]>0) {
					System.out.print(matrix4[i][i]+" ");
				}
			}
		//10
			
		//Task 11
			System.out.println("\nTask 11:");
			int matrix5[][]=new int[10][20];
			int NumberFiveCounter;
			for(int i=0;i<10;i++) {
				for(int j=0;j<20;j++) {
					matrix5[i][j]=(int) (Math.random()*16);
					System.out.print(matrix5[i][j]+" ");
				}
				System.out.println();
			}
			System.out.print("Line numbers: ");
			for(int i=0;i<10;i++) {
				NumberFiveCounter=0;
				for(int j=0;j<20;j++) {
					NumberFiveCounter=(matrix5[i][j]==5)?NumberFiveCounter+1:NumberFiveCounter;
				}
				if(NumberFiveCounter>=3) {
					System.out.print(i+1 + " ");
				}
			}
		//11
			
		//Task 12
			n=7;
			int matrix12[][]=new int[n][n];
			System.out.println("\nTask 12:\nBefore sort:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix12[i][j]=(int) (Math.random()*16);
					System.out.print(matrix12[i][j]+" ");
				}
				System.out.println();
			}
			int TempElem=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int j1=j+1;j1<n;j1++) {
						if(matrix12[i][j]>matrix12[i][j1]) {
							TempElem=matrix12[i][j1];
							matrix12[i][j1]=matrix12[i][j];
							matrix12[i][j]=TempElem;
						}
					}
				}
			}
			System.out.println("After positive sort:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix12[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int j1=j+1;j1<n;j1++) {
						if(matrix12[i][j]<matrix12[i][j1]) {
							TempElem=matrix12[i][j1];
							matrix12[i][j1]=matrix12[i][j];
							matrix12[i][j]=TempElem;
						}
					}
				}
			}
			System.out.println("After negative sort:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix12[i][j]+" ");
				}
				System.out.println();
			}
		//12
			
		//Task 13
			System.out.println("\nTask 13:\nBefore sort:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix12[i][j]=(int) (Math.random()*16);
					System.out.print(matrix12[i][j]+" ");
				}
				System.out.println();
			}
			for(int j=0;j<n;j++) {
				for(int i=0;i<n;i++) {
					for(int i1=i+1;i1<n;i1++) {
						if(matrix12[i][j]>matrix12[i1][j]) {
							TempElem=matrix12[i1][j];
							matrix12[i1][j]=matrix12[i][j];
							matrix12[i][j]=TempElem;
						}
					}
				}
			}
			System.out.println("After positive sort:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix12[i][j]+" ");
				}
				System.out.println();
			}
			for(int j=0;j<n;j++) {
				for(int i=0;i<n;i++) {
					for(int i1=i+1;i1<n;i1++) {
						if(matrix12[i][j]<matrix12[i1][j]) {
							TempElem=matrix12[i1][j];
							matrix12[i1][j]=matrix12[i][j];
							matrix12[i][j]=TempElem;
						}
					}
				}
			}
			System.out.println("After negative sort:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix12[i][j]+" ");
				}
				System.out.println();
			}
		//13
			
		//Task 14
			int m=5;
			n=3;
			int matrix14[][]=new int[m][n];
			System.out.println("\nTask 14:");
			for(int j=0;j<n;j++) {
				k=j+1;
				for(int i=0;i<m;i++) {
					if(k>0) {
						matrix14[i][j]=1;
						k--;
					}
					else {
						matrix14[i][j]=0;
					}
				}
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix14[i][j]+" ");
				}
				System.out.println();
			}
		//14
			
		//Task 15
			System.out.println("\nTask 15:\nMatrix before change:");
			n=5;
			int matrix15 [][]=new int[n][n];
			int MaxElem=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix15[i][j]=(int) (Math.random()*16);
					System.out.print(matrix15[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					MaxElem=(matrix15[i][j]>MaxElem)?matrix15[i][j]:MaxElem;
				}
			}
			System.out.println("Max Element:" + MaxElem + "\nMatrix after change:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					matrix15[i][j]=((i+j+1)%2!=0)?MaxElem:matrix15[i][j];
					System.out.print(matrix15[i][j]+" ");
				}
				System.out.println();
			}
		//15
			
	}
}

