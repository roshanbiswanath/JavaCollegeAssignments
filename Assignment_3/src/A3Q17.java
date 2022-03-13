import java.util.Scanner;
public class A3Q17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean bool = (num%5==0) && (num%6==0);
		System.out.println("Is " + num + " divisible by 5 and 6? "+bool);
		bool = (num%5==0) || (num%6==0);
		System.out.println("Is " + num + " divisible by 5 or 6? "+bool);
		bool = (num%5==0) ^ (num%6==0);
		System.out.println("Is " + num + " divisible by 5 or 6, but not both? "+bool);
	}
}