package array;

import java.util.Scanner;

public class PrimeElement {
	
	static int prime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return 1;
		}
		else {
			return 0;
			}
		}

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values");
		for(int i=0; i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<size;i++) {
		System.out.println(a[i]);
		}
		System.out.println("Prime elements are:");
		for(int j=0; j<size;j++) {
			int n=prime(a[j]);
			if(n==1) {
				System.out.println(a[j]);
			}
		}

	}
			
			

}


