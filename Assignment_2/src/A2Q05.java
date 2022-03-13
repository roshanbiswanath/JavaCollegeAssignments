import java.util.Scanner;
public class A2Q05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter v0, v1, and t: ");
		Scanner sc = new Scanner(System.in);
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		double a = ((double)(v1 - v0))/t;
		System.out.println("The average acceleration is "+ a);
	}
}
