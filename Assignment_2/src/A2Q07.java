import java.util.Scanner;
import java.lang.Math;
public class A2Q07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = sc.nextDouble();
		double area = (3*Math.sqrt(3)/2.0)*Math.pow(side, 2);
		System.out.println("The area of the hexagon is "+area);
	}
}
