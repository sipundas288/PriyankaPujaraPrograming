package Day5;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);

		int temp =a;
		a=b;
		b=temp;
		
		System.out.println("After swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);

	}

}
