import java.util.Scanner;
public class A4Q11_3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j = n-i;j>0;j--)
				System.out.print(" ");
			for(int k =1;k<=i;k++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}
