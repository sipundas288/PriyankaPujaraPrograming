package Practice;

public class Fibonaci {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		int start=5, end=100;
		
		
		for(int i=start;i<=end;i++) {
			
		
			if(n1>=start && n1<=end) {
			System.out.println(n1);
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
	
			
		}
	}

}
