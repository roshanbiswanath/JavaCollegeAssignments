import java.util.Scanner;
public class A5Q08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		double fact = 1;
		for(int i = 2;i<=n;++i) 
			fact *= i;
		System.out.println(n+"! = "+fact);
	}
}
