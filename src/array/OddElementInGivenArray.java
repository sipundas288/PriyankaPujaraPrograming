package array;

import java.util.Scanner;

public class OddElementInGivenArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter Array elements");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Odd elements form given array are");
		for(int i=0; i<size;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
