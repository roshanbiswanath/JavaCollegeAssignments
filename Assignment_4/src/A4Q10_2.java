import java.util.Scanner;
public class A4Q10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int i = 1;
		int j = 1;
		while(i<=n) {
			j = 1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
