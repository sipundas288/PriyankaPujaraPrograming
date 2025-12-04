package array;

import java.util.Scanner;

public class SumOfEvenElementAndSumOfOddElement {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		int sumE=0;
		int sumO=0;
		
		for(int i=0; i<size;i++) {
			if(a[i]%2==0){
			sumE=sumE+a[i];
			}
			else {
				sumO+=a[i];
			}
		}
		System.out.println("Sum of even element:"+sumE);
		System.out.println("Sum of Odd element:"+sumO);
	}

}
