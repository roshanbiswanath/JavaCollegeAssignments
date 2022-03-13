import java.util.Scanner;
public class A2Q04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int num = sc.nextInt();
		if (num <1000 && num>=0) {
			int sum = 0;
			sum+=num%10;
			num = num/10;
			sum+=num%10;
			num = num/10;
			sum+=num%10;
			System.out.println("The sum of the digits is "+sum);
		}
	}

}
