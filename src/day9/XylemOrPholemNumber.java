package day9;

public class XylemOrPholemNumber {

	public static void main(String[] args) {
		
		int num =  12345;
		
		int originalNum = num;
		
		int extremeSum=0, middleSum=0;
		
		int lastdigit = num%10;
		
		
		extremeSum = extremeSum+lastdigit;
		
		
		num=num/10;
		
		while(num>9)
		{
			
			int middle = num%10;
			
			middleSum = middleSum+middle;
			
			num = num/10;
			
		}
		
		extremeSum = extremeSum+num;
		
		if(extremeSum==middleSum)
		{
			System.out.println(originalNum+"is a xylem number");
		}
		else {
			System.out.println(originalNum+"is apholem number");
		}
	}

}
