import java.util.Scanner;
public class A2Q01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a degree in Celcius: ");
		double celcius = sc.nextDouble();
		double farenheit = (9.0/5) * celcius + 32;
		System.out.println(celcius+" Celcius is "+farenheit +" Fahrenheit");
	}
}
