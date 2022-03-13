import java.util.Scanner;
public class A3Q18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What is your gender (M or F): ");
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		System.out.print("First name: ");
		String fName = sc.next();
		System.out.print("Last name: ");
		String lName = sc.next();
		System.out.print("Age: ");
		int age = sc.nextInt();
		if(gender == 'M' || gender == 'm') {
			if(age>=20)
				System.out.println("Then I shall call you Mr. "+fName);
			else
				System.out.println("Then I shall call you "+fName+" "+lName);
		}
		else if (gender == 'F' || gender == 'f') {
			if(age>=20) {
				System.out.print("Are you married,(y or n)? ");
				char married = sc.next().charAt(0);
				if(married == 'y' || married == 'Y')
					System.out.println("Then I shall call you Mrs. "+fName+" "+lName);
				else if (married == 'n' || married == 'N')
					System.out.println("Then I shall call you Ms. "+fName);
				else
					System.out.println("Invalid Input provided, Restart");
			}
			else
				System.out.println("Then I shall call you "+fName+" "+lName);
		}
		else
			System.out.println("Invalid Input provided, Restart");
	}
}
