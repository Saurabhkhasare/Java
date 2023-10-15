package Assignment_day7;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Stack s = null;
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		while (true) {
			System.out.println("1.Fixed stack");
			System.out.println("2.Growable stack");
			System.out.println("3.push");
			System.out.println("4.pop");
			System.out.println("5.exit");

			System.out.println("Enter your choice");

			
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if(!flag) {

				s = new FixedStack();
				flag = true;
				}else {
					System.out.println("You have choosen growable stack already");
				}
				
				break;

			case 2:
				if(!flag) {
			
				s = new GrowableStack();
				flag = true;
				}else{
					System.out.println("You have choosen fixed stack already");
				}
				
				break;
			
			case 3:

				if(flag) {
					System.out.println("Enter your details : id ,name, address");
					Customer arr = new Customer(sc.nextInt(), sc.next(), sc.next());


						s.push(arr);
				}else	{
					System.out.println("First you need to choose stack");
			}


				break;
			case 4:
				if(flag) {
						s.pop();
				}else {
					System.out.println("First you need to choose stack");
				}
						break;
				
			case 5:
				
				System.exit(0);
				break;
			}
		}
		
	}

}
