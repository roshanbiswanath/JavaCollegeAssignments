import java.util.Scanner;
public class A5Q21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers to find their gcd: ");
		int x = sc.nextInt(),y = sc.nextInt();
		int a = x>y?x:y,b = x + y - a,c;
		while(a % b != 0) {
			c = a%b;
			a = b;
			b = c;
		}
		System.out.println("gcd("+x+","+y+") = "+b);
	}
}