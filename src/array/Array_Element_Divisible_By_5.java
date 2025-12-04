package array;

import java.util.Scanner;

public class Array_Element_Divisible_By_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter Array element");
		
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
			
		}
		for(int i=0; i<size;i++) {
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}
		}
	}

}
