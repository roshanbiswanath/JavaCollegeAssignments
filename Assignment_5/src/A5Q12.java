import java.util.Scanner;
public class A5Q12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x to find e^x: ");
		double x = sc.nextDouble(),a = 1,sum = 1;
		int i = 1;
		while(Math.abs(a)>0.0001) {
			a = a*x/i;
			sum+=a;
			i++;
		}
		System.out.println("e^"+x+" = "+sum);
	}

}
