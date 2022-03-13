import java.util.Scanner;
public class A4Q08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check divisibility by 9: ");
		int num = sc.nextInt(),n = num,sum = 0;
		//int n = num;
		//int sum = 0;
		while (n>0) {
			sum += n % 10;
			n = n/10;
		}
		if(sum%9==0) {
			System.out.println(num+" is divisible by 9");
		}
		else {
			System.out.println(num+" is not divisible by 9");
		}
	}

}
