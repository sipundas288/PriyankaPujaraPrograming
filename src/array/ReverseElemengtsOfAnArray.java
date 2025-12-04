package array;

import java.util.Scanner;

public class ReverseElemengtsOfAnArray {

	public static void main(String[] args) {
		
//		int a[]= {1,5,8,9,7};
//		for(int i=a.length-1; i>=0;i--)
//			System.out.println(a[i]);
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		int[] a= new int[size];
		System.out.println("enter the values");
		for (int i=0; i<a.length;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("===============");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		

	}

}
