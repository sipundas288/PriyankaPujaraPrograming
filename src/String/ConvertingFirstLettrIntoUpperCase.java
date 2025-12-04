package String;

public class ConvertingFirstLettrIntoUpperCase {

	public static void main(String[] args) {

		String value= "java is simple";
		String[] str = value.split(" ");
		String s1="";
		for(int i=0;i<str.length;i++) {
			char[] ch=str[i].toCharArray();
			for(int j=0; j<ch.length;j++) {
				if(j==0 && (ch[j] >='a' && ch[j] <= 'z')) {
					char c=(char) (ch[j]-32);
					s1+=c;
					
				}
				else {
					s1+=ch[j];
				}
				
			
			}
			s1+=" ";
			
		}
		System.out.println(s1);
	}

}
