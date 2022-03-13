import java.util.Scanner;
public class A4Q11_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int num = 1;
		for(int i = 1;i<=n;i++) {
			for(int j =1;j<=2*n - 1;j++) {
				if(j<=(n-i) || j>(n+ i - 1)) {
					System.out.print(" ");
				}
				else {
					System.out.print(num + " ");
					j++;			
					num++;
				}
			}
			System.out.println();
		}
	}

}
