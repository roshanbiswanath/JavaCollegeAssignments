import java.util.Scanner;
public class A3Q16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks out of 100: ");
		int check = sc.nextInt()/10;
		//int marks = sc.nextInt();
		//int check = marks/10;
		char grade;
		switch(check) {
		case 10:
		case 9:
			grade = 'O';
			break;
		case 8:
			grade = 'A';
			break;
		case 7:
			grade = 'B';
			break;
		case 6:
			grade = 'C';
			break;
		case 5:
			grade = 'D';
			break;
		case 4:
			grade = 'E';
			break;
		default:
			grade = 'F';
		}
		System.out.println("Grade: "+grade);
	}
}