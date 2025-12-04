package array;

import java.util.Scanner;

public class RowSum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter row size");
		int row=s.nextInt();
		
		System.out.println("Enter the column size");
		int column=s.nextInt();
		
		int[][] a=new int[column][row];
		System.out.println("enter the values");
		
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=s.nextInt();
			}
			
		}
		System.out.println("=======================");
		
		for(int i=0; i<row;i++) {
			
			for(int j=0; j<column;j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("============column sum===============");
		for(int i=0; i<column;i++) {
			int sum=0;
			for(int j=0;j<row;j++) {
				sum=sum+a[j][i];
			}
			System.out.println(sum);
		}
		}
		

}
