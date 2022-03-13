import java.util.Scanner;
public class A2Q12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of eggs: ");
		int eggs = sc.nextInt();
		int gross = eggs/144;
		int left = eggs%144;
		int dozen = left/12;
		left = left%12;
		System.out.println("Your numbers of eggs is "+gross+" gross, "+dozen+" dozen, and "+left);
	}
}
