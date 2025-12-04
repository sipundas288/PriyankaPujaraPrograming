package day8;

public class SpyNumberOrNot {

	public static void main(String[] args) {
		
		int num =1254, sum=0, product = 1;
		int orgNum=num;
		
		while(num!=0)
		{
			int ld = num%10;
			sum =sum+ld;
			product=product*ld;
			num=num/10;
			
			
		
			
		}
		System.out.println("Sum ="+sum);
		System.out.println("Product ="+product);
		
		if(sum == product)
		{
		}
		else
		{
			System.out.println(orgNum+"is nota a spy number");
		}
	}

}
