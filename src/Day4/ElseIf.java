package Day4;

public class ElseIf {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=20;
		c=30;
	if(a==b && b==c)
	{
		System.out.println("All three are equal"+a);
		
	}
	else if(a==b && a>c)
	{
		System.out.println("a and b are equal and grea");
	}
	else if(a==c && a>b)
	{
		System.out.println("a and c are equal and greatest number"+a);
	}
	else if(b==c && b>a)
	{
		System.out.println("b and c are equal and greatest is "+b);
	}
	else if(a>b && a>c)
	{
		System.out.println("a  is greatest"+a);
		
	}
	else if(b>a && b>c)
	{
		System.out.println("b is greatest"+b);
	}
	else
	{
		System.out.println("C is greatest"+c);
	}
				

	}

}
