import java.util.Scanner;
public class A5Q17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n to find its square root: ");
		int n = sc.nextInt();
		double x = n,y = 0;
		while(Math.abs(y - x)>0.0001) {
			y = x;
			x = 0.5*(x+(n/x));
		}
		System.out.println("Square root of "+n+" is "+x);	
	}
}
