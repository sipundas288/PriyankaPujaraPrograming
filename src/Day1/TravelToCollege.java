package Day1;

import java.util.Scanner;

public class TravelToCollege {

	public static void main(String[] args) {
		System.out.println("Wake up");
		System.out.println("get ready");
		Scanner	sc = new Scanner(System.in);
		
		while(true)
		{
			int flag =0;
			System.out.println("select mode of transport(wak/bus/bike/exit)");
			
			String mode = sc.next();
			
			
			switch(mode)
			{
			case "walk" : System.out.println("walking to college");
			break;
			
			case "bus" : System.out.println("Taking bus to the collage");
			break;
			
			case "bike" : System.out.println("Taking bike to the collage");
			break;
			
			case "exist" : System.out.println("existing");
			break;
			
			default: System.out.println("Incert a valid choice");
			flag++;
			break;
			
			}
			if(flag!=0)
			{
				System.out.println("Reached to collage");
			}
		
		}

	}

}
