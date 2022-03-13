import java.util.Scanner;
import java.lang.Math;
public class A3Q05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.println("Given equation: "+a+"x² + "+b+"x + "+c);
		double d = Math.pow(b, 2) - 4*a*c;
		if (d > 0) {
			double r1 = ( - b + Math.sqrt(d))/(2*a);
			double r2 = ( - b - Math.sqrt(d))/(2*a);
			System.out.println("The equation has two roots "+r1+" and "+r2);
		}
		else if(d==0) {
			double r1 = - b/(2*a);
			System.out.println("The equation has one root "+r1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}
}
