import java.util.Scanner;
public class A2Q13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = sc.nextInt();
		int days = minutes/(60*24);
		int years = days/365;
		days = days%365;
		/*
		int years = minutes/(60*24*365);
		int left = minutes%(60*24*365);
		int days = left/(60*24);
		*/
		System.out.println(minutes + " minutes is approximately "+years+" years and "+days+" days.");
	}
}
