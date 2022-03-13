import java.lang.Math;
import java.util.Scanner;
public class A2Q02 {
	//final static double PI = Math.PI;
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.print("Enter the radius and length of cylinder: ");
		Scanner sc = new Scanner(System.in);
		double radius =  sc.nextDouble();
		double length = sc.nextDouble();
		//double area = radius*radius*A2Q02.PI;
		double area = radius*radius*Math.PI;
		double volume = area*length;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
		
	}

}
