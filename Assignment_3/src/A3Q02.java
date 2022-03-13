import java.util.Scanner;
public class A3Q02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		float marks = sc.nextFloat();
		if(marks>=40) 
			System.out.println("Congratulation! You have passed the exam. :D");
		else 
			System.out.println("Sorry! You have failed the exam. :(");
	}
}
