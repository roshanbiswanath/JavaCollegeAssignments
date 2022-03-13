import java.util.Scanner;
public class A5Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value in degrees: ");
		double x = sc.nextDouble()*Math.PI/180;
		double value = x,a=x;
		int i = 0;
		while(Math.abs(a)>0.000001) {
			a = a*(x*x)/((i+2)*(i+3))*(-1);
			value += a;
			i+=2;
		}
		System.out.println(value);
	}
}
