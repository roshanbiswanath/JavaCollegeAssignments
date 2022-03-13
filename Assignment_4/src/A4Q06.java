import java.util.Scanner;
public class A4Q06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for its multiplication table: ");
		int x = sc.nextInt();
		for (int i = 1; i<=10;++i)
			System.out.println(x + " x " + i + " = "+x*i);
	}
}
