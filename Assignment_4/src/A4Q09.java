import java.util.Scanner;
public class A4Q09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		int i = 0;
		while (Math.pow(2, i) <= n) {
			i++;
		}
		System.out.println(
				"Largest power of 2 less than or equal to "+n+" is "+(int)Math.pow(2, i-1)
				);
		*/
		int j;
		for(j=0;Math.pow(2, j)<=n;j++);
		System.out.println(
				"Largest power of 2 less than or equal to "+n+" is "+(int)Math.pow(2, j-1)
				);
	}
}
