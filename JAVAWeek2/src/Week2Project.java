import java.util.Scanner;

public class Week2Project {

	public static void main(String[] args) {
		
		
	Scanner teams = new Scanner(System.in);
		
		System.out.print("Enter your name Baller: ");
		String name = teams.nextLine();
		
		System.out.println("Welcome, " + name);
		
		int selectionOfAPlayer= 0;
		String total = "";
		
		while (selectionOfAPlayer != 4) {
			System.out.println("Select a Player ");
			System.out.println("1) add Kobe Bryant to Roster");
			System.out.println("2) add Lebron James to Roster");
			System.out.println("3) add Yao Ming to Roster");
			System.out.println("4) complete team");
			
			selectionOfAPlayer = teams.nextInt();
			
			
			switch (selectionOfAPlayer) {
				case 1: 
					total+= " Los Angeles Lakers ";
					break;
				case 2:
					total+= " Miami Heat ";
					break;
				case 3: 
					total+= " Houston Rockets ";
					break;
				case 4: 
					break;
				default:
					System.out.println("Please pick a valid player. ");
		}
	}
		System.out.println("Your player(s) you selected is on: " +  total);
		

	}

}
