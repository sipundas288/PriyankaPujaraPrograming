package array;

import java.util.Scanner;

public class StoreAndFetchArrayDynamically {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("===============");
		for(int i=0;i<size;i++)
			System.out.println(a[i]);
		

	}

}
