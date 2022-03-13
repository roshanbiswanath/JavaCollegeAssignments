import java.util.Scanner;
public class A3Q12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int a,b,c,x,y,z;
		x = a = sc.nextInt();
		y = b = sc.nextInt();
		z = c = sc.nextInt();
		if(a>b) {
			b = a+b;
			a = b-a;
			b = b-a;
		}
		if(b>c) {
			c = b+c;
			b = c-b;
			c = c-b;
		}
		if(a>b) {
			b = a+b;
			a = b-a;
			b = b-a;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
