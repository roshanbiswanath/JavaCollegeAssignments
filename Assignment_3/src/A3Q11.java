import java.util.Scanner;
import java.lang.Math;
public class A3Q11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height in m");
		double h = sc.nextDouble();
		System.out.print("Enter weight in kg");
		double w = sc.nextDouble();
		double bmi = w/Math.pow(h, 2);
		if(bmi<18.5)
			System.out.println("underweight");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("normal weight");
		else if (bmi >= 25.0 && bmi <= 29.9)
			System.out.println("overweight");
		else
			System.out.println("obese");
	}
}