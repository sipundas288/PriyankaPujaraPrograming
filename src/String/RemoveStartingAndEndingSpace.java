package String;

public class RemoveStartingAndEndingSpace {

	public static void main(String[] args) {
		
		String s="  ab  ";
		int start=0;
		int end=s.length()-1;
		for(int i=0; i<s.length()-1;i++) {
			if(s.charAt(start)==' ') {
				start++;
				
			}
			if(s.charAt(end)==' ') {
				end--;
			}
		}
		for(int i=start;i<=end;i++) {
			System.out.print(s.charAt(i));
		}
	}

}
