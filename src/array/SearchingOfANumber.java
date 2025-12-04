package array;

import java.util.Scanner;

public class SearchingOfANumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the values");
		for(int i=0; i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element is to search");
		int element=sc.nextInt();
		sc.close();
		
		boolean flag=false;
		for(int i=0;i<size;i++) {
			if(a[i]==element) {
				System.out.println("element found");
				flag=true;
				break;
			}
		}
			
			if(flag==false) {
				System.out.println("element not fount");
			}
				
	}
		
		
		
}


