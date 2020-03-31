import java.util.Scanner;

public class Week2MenuDrivenApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Welcome, " + name);
		
		int selection = 0;
		double total = 0;
		
		while (selection != 4) {
			System.out.println("Select an option, ");
			System.out.println("1) add candybar to shopping cart: $1.99");
			System.out.println("2) add cheese to shopping cart: $4.94");
			System.out.println("3) add basketball to shopping cart: $10.84");
			System.out.println("4) check out");
			
			selection = sc.nextInt();
			
			switch (selection) {
				case 1: 
					total += 1.99;
					break;
				case 2:
					total+= 4.94;
					break;
				case 3: 
					total += 10.84;
					break;
				case 4: 
					break;
				default:
					System.out.println("Please pick a valid option. ");
		}
	}
		
		System.out.println("Your current total is: " + total);
		
		
	}

}
