import java.util.Scanner;
public class A2Q03 {
	//final static double FT = 0.305; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = sc.nextDouble();
		//double m = feet*A2Q03.FT;
		double m = feet*0.305;
		System.out.println(feet+" feet is "+m+" meters");
	}
}
