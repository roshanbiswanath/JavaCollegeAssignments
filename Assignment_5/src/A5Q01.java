import java.util.Scanner;
public class A5Q01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
			System.out.println(i +"   "+(int)Math.pow(2, i));
		//System.out.println("Largest power of 2 less than or equal to "+n+" is "+(int)Math.pow(2, i-1));
	}
}