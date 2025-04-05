package SimpleCalculator;

import java.util.Scanner;

public class Main {
		
	private static void Operations() {
		
		System.out.println("1. Addition \n2. Subraction\n3. Multiplicat	ion\n4. Division\n 5. Suqares of number");
	}
	public static void main(String[] args) {
			
		SimpleCalculator user = new funtionsInCalculator();
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Welcome to the user ");
			sc.nextLine();
			
			System.out.println("How can i help you");
			sc.nextLine();
//			
			System.out.print("Ok that's great :) ");
			System.out.println("Please provide the two numbers :");
			
			System.out.println("Please enter 1st number: ");
			int a = sc.nextInt();
			
			System.out.println("Please enter 2nd number: ");
			int b = sc.nextInt();
			user.setB(b);
			user.setA(a);
			 
			System.out.println("What type of operation do you want to perform ??");
			
			Operations();
			
			int choice = sc.nextInt();
			
			double result = 0;
		do {	
			switch(choice)
				{
				case 1:
					result = user.addition();
					break;
				case 2:
  					result = user.subraction();
					break;
				case 3:
					result = user.multiplication();
					break;
				case 4:
					result = user.divison();
					break;
				case 5:
					result = user.SquareOfNumber();
					break;
				default:
					System.out.println("Please provide given operations only !!!");
					Operations();	
				}
			}
			while(choice<=5);
			System.out.println(result);
			
			sc.close();
	}

}
