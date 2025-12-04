package array;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values");
		for(int i=0; i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("==================");
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(min>a[i]);{
				min=a[i];
			}
		}
		System.out.println("minimun element is ="+min);
		
	
	}

}
