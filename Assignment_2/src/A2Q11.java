import java.lang.Math;
import java.util.Scanner;
public class A2Q11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double amount = sc.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double rate = sc.nextDouble();
		double monthlyRate = rate/1200;
		System.out.print("Enter number of years: ");
		double year = sc.nextDouble();
		double future = amount*Math.pow((1 + monthlyRate),year*12);
		System.out.println(future);
	}
}
