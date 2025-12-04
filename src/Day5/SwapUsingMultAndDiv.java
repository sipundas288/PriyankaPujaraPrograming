package Day5;

public class SwapUsingMultAndDiv {

	public static void main(String[] args) {
		
		int a=5, b=10;
		
	
		System.out.println("Before swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
		System.out.println("*************");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);

	}

}
