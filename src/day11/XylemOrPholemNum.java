package day11;

public class XylemOrPholemNum {

	public static void main(String[] args) {
		
		int num= 1234;
		int originalNum=num;
		int extremeSum=0, middleSum=0;
		
		int lastdigit=num%10;
		extremeSum = extremeSum+lastdigit;
		num=num/10;
		
		while(num>9)
		{
			int middleEle = num%10;
			middleSum=middleSum+middleEle;
			
		}
	
	}

}
