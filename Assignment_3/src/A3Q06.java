import java.util.Scanner;
public class A3Q06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		System.out.println("Provided Equations:");
		System.out.println(a+"x + "+b+"y = "+e);
		System.out.println(c+"x + "+d+"y = "+f);
		if ((a*d - b*c) == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			double x = (e*d - b*f)/(a*d - b*c);
			double y = (a*f - e*c)/(a*d - b*c);
			System.out.println("x is "+x+" and y is "+y);
		}
	}

}
