import java.util.Scanner;
public class A5Q09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X : ");
		int x = sc.nextInt();
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		double val=x;
		for(int i = 2;i<=n;++i) 
			val = (val*x)/i; 
		System.out.println(val);
	}

}
