package array;

import java.util.Scanner;

public class BubbleShot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
		int flag=0;
		for(int j=0;j<size-1-i;j++) {
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
				
			}
		}
		if(flag==0) {
			break;
		}
	}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
		
	
		
	
	}
}
