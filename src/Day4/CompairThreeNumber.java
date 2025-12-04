package Day4;

public class CompairThreeNumber {

	public static void main(String[] args) {
		int a, b, c;
		a=100;
		b=300;
		c=300;
		
		if(a==b && b==c)
		{
			System.out.println("All three number's are equal"+a);
		}
		else if(a==b && b==c)
		{
			System.out.println(" a and b are equal and gretest number is "+a);
		}
		else if(a==c && a>b)
		{
			System.out.println("a and c are equal and gretest is "+a);
		}
		else if(b==c && b>a)
		{
			System.out.println("b and c are equal and gretest is "+b);
		}
		else if(a>b && a>c) {
			System.out.println("a is the gretest");	
		}
		else if(b>a && b>c)
		{
			System.out.println("b is gretest");
		}
		else
		{
			System.out.println("c is gretest");
		}
		

	}

}
