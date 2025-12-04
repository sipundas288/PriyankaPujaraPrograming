package day15;

public class Febonacci {

	public static void main(String[] args) {
		int num1=1, num2=2,sum =0;
		
		for(int i=3;i<10;i++) {
			sum=num1+num2;
		System.out.println(sum);
		
		num1=num2;
		num2=sum;
		
		
		}
		
		

	}

}
