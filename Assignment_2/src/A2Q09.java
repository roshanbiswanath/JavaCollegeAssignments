import java.util.Scanner;
import java.lang.Math;
public class A2Q09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distance = Math.sqrt(
				Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
				);
		System.out.println("The distance between the two points is "+distance);
		
	}

}
