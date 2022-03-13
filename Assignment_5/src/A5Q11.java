import java.util.Scanner;
public class A5Q11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble()*Math.PI/180;
		double value = 1,a=1;
		int i = 0;
		while(Math.abs(a)>0.000001) {
			a = a*(x*x)/((i+1)*(i+2))*(-1);
			value += a;
			i+=2;
		}
		System.out.println(value);
	}
}
