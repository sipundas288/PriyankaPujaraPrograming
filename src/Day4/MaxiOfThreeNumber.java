package Day4;

public class MaxiOfThreeNumber {

	public static void main(String[] args) {
		int a, b, c;
		a=10;
		b=15;
		c=2;
		if(a>b && a>c)
		{
			System.out.println(a+"is maximum");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"is maximum");
		}
		else
		{
			System.out.println(c+"is maximum");
		}

	}

}
