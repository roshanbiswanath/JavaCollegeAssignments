import java.util.Scanner;
public class A4Q01_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from: ");
		int from = sc.nextInt();
		System.out.print("Count to: ");
		int to = sc.nextInt();
		System.out.print("Count by: ");
		int step = sc.nextInt();
		for (int i = from ;  i <=  to; i=i+step)
			System.out.print(i+" ");		
	}
}