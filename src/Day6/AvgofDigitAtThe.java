package Day6;

public class AvgofDigitAtThe {

	public static void main(String[] args) {
		int num = 12345;
		
		int sum=0;
		int count=0;
		int position =1;
		int temp = num;
		
		while(temp!=0)
		{
			int digit = temp%10;
			if(position %2==0)
			{
				sum=sum+digit;
				count++;
				
			}
			temp=temp/10;
			position++;
		}
		if(count>0)
		{
			int avg = sum/count;
			System.out.println(avg+"is the avg of digit in even of num");
		}
		else {
			
			System.out.println("no digit present in even position");
		}
	}

}
