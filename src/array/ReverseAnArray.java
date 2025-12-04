package array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=s.nextInt();
		int[] a =new int[size];
		System.out.println("Enter array element");
		
		for(int i=0;i<size;i++) {
		a[i]=s.nextInt();
		}
		int[] b=new int[size];
		int t=size-1;
		for(int i=0;i<size;i++) {
			b[t]=a[i];
			t=t-1;
			
		}
		System.out.println("==========1st Logic===========");
		for(int l=0;l<size;l++) {
			System.out.println(b[l]);
		}
		System.out.println("==========2nd Logic===========");
		for(int i=size-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		int i=0;
		int j=size-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
				
		
		System.out.println("==========3rd Logic===========");
		for(int k=0;k<size;k++) {
			System.out.println(a[k]);
		}
		

	}

}
