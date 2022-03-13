import java.util.Scanner;
public class A2Q06 {
	//final static double  PD = 0.45359237f;
	//final static double  INCH = 0.0254f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		float pound =sc.nextFloat();
		System.out.print("Enter height in inches: ");
		float inch =sc.nextFloat();
		//double kg = pound*A2Q06.PD;
		//double m = inch*A2Q06.INCH;
		double kg = pound*0.45359237;
		double m = inch*0.0254;
		double bmi = (kg/Math.pow(m, 2));
		System.out.println("BMI is "+bmi);
		
	}

}
