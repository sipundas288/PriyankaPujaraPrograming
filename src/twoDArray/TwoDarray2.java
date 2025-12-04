package twoDArray;

import java.util.Scanner;

public class TwoDarray2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter row size");
		int row=s.nextInt();
		
		System.out.println("enter column size");
		int column=s.nextInt();
		
		char[][] ch=new char [row][column];
		System.out.println("enter the value");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				ch[i][j]=s.next().charAt(0);
			}
		}
		System.out.println("======================");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println(ch[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
