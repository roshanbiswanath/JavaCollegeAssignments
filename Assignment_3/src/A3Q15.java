import java.util.Scanner;
public class A3Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a point with two coordinates: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = Math.pow(x, 2) + Math.pow(y, 2);
		System.out.print("Point ("+x+", "+y+") is");
		if(z < 100)
			System.out.println(" in the circle.");
		else if(z==100)
			System.out.println(" on the circle.");
		else
			System.out.println(" not in the circle.");
	}
}