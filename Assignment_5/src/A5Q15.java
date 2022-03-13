import java.util.Scanner;
public class A5Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter monthly savings amount: ");
		int amt = sc.nextInt();
		System.out.print("Enter annual interest rate: ");
		double mr = sc.nextInt()/1200.0,finalAmt=0;
		System.out.print("Enter no. of months: ");
		int m = sc.nextInt();
		for(int i=1;i<=m;i++)
			finalAmt = (finalAmt + amt)*(1+mr);
		System.out.println("Amount in savings account: "+finalAmt);
		
	}
}