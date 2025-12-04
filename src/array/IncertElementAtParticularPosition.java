package array;

import java.util.Scanner;

public class IncertElementAtParticularPosition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size+1];
		System.out.println("enter array element");
		for(int i=0; i<size;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("========================");
		System.out.println("enter array position");
		int position=sc.nextInt();
		
		if(position>=0 && position<=size) {
			System.out.println("enter element to be incerted");
			int  ele= sc.nextInt();
			for(int i=size-1;i>=position;i--) {
				a[i+1]=a[i];
			}
			a[position]=ele;
			size++;
			
			for(int i=0; i<a.length;i++) {
				System.out.println(a[i]);
			}
			
		}
		else {
			System.out.println("invalid position");
		}
	}
	

}
