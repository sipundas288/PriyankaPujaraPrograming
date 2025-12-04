package array;

import java.util.Scanner;

public class LargestElement{

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("================");
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		System.out.println("maximum element is ="+max);
		
		
	}

}
