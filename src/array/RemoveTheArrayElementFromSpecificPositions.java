package array;

import java.util.Scanner;

public class RemoveTheArrayElementFromSpecificPositions {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("enter array element");
	for(int i=0; i<size;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("enter array position");
	
	int position = sc.nextInt();
	int temp=a[position-1];
	for(int i=position-1;i<size-1;i++) {
		a[i]=a[i+1];
	}
	size--;
	for(int i=0; i<size;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Removed element is:"+temp);
	

	}

}
