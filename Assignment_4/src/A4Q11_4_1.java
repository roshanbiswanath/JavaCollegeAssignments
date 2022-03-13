import java.util.Scanner;
public class A4Q11_4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int num = 1;
		for(int i =1;i<=n;i++) {
			for(int j = n-i;j>0;j--)
				System.out.print(" ");
			for(int k =1;k<=i;k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}	
	}
}