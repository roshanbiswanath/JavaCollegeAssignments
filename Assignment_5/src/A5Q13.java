import java.util.Scanner;
public class A5Q13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt(),a = 0,b = 1,c = 0;
		for(int i = 1;i<=n;++i) {
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a + b;
		}
		/*
		if(n==1) {
			System.out.println(a);
		}
		if (n==2) {
			System.out.println(a+" "+b);
		}
		else {
			System.out.print(a + " "+b+" ");
			int c;
			for(int i=3;i<=n;++i) {
				c = a+b;
				System.out.print(c+" ");
				a = b;
				b = c;
				if(i%10==0) {
					System.out.println();
				}
			}
		}
		*/
	}
}