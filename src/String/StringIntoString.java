package String;

public class StringIntoString {

	public static void main(String[] args) {
		
		String s="Good Morning";
		String[] sc=new String[s.length()];
		
		for(int i=0;i<s.length();i++) {
			sc[i]=s.charAt(i)+" ";
			
		}
		System.out.println("================");
		for(int i=0;i<sc.length;i++) {
			System.out.print(sc[i]);
		}
		System.out.println("===============");
		System.out.println(s.toCharArray());
	}

}
